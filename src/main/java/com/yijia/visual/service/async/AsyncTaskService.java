package com.yijia.visual.service.async;

import com.yijia.visual.service.async.context.SofaTraceContext;
import com.yijia.visual.service.async.task.ExampleQueryTask;
import com.yijia.visual.service.async.task.SofaTracerCallable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 简介说明:多线程处理类
 *
 * @author: biboyuzhou
 * @date: 2025/02/15 14:29:10
 * @version:1.0
 */
@Service
public class AsyncTaskService {

    public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 200, 5000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2000));

    /**
     * 异步查询任务
     * @param latch
     * @param futures
     * @return
     * @param <T>
     */
    public <T> List<T> asyncQuery(CountDownLatch latch, List<Future<List<T>>> futures) {
        long start = System.currentTimeMillis();
        List<T> resultList = new ArrayList<>();
        //等待计数完毕，最多等待1s
        try {
            latch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            //计数等待出错
            e.printStackTrace();
        }

        //将所有任务合并
        for (Future<List<T>> future : futures) {
            if (future == null) {
                continue;
            }
            try {
                List<T> result = future.get(1, TimeUnit.SECONDS);
                if (!CollectionUtils.isEmpty(result)) {
                    resultList.addAll(result);
                }
            } catch (Exception e) {
                //等待拿到结果出错
                e.printStackTrace();
            }
        }
        System.out.println("[asyncQuery]计数总耗时：" + (System.currentTimeMillis() - start) + "总数为：" + resultList.size());
        return resultList;
    }

    /**
     * 异步查询单个任务
     * @param latch
     * @param futures
     * @return
     * @param <T>
     */
    public <T> List<T> asyncQuerySingle(CountDownLatch latch, List<Future<T>> futures) {
        long start = System.currentTimeMillis();
        List<T> resultList = new ArrayList<>();
        //等待计数完毕，最多等待1s
        try {
            latch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            //计数等待出错
            e.printStackTrace();
        }

        //将所有任务合并
        for (Future<T> future : futures) {
            if (future == null) {
                continue;
            }
            try {
                T t = future.get(1, TimeUnit.SECONDS);
                if (t != null) {
                    resultList.add(t);
                }
            } catch (Exception e) {
                //等待拿到结果出错
                e.printStackTrace();
            }
        }
        System.out.println("[asyncQuery]计数总耗时：" + (System.currentTimeMillis() - start) + "总数为：" + resultList.size());
        return resultList;
    }

    public List<String> asyncQueryExample(List<String> stringList) {
        CountDownLatch latch = new CountDownLatch(stringList.size());
        List<Future<List<String>>> futures = new ArrayList<>();
        for (String id : stringList) {
            ExampleQueryTask exampleQueryTask = new ExampleQueryTask(id, "tableName", latch, id);
            SofaTraceContext sofaTraceContext = new SofaTraceContext() {
                @Override
                public void push() {
                    System.out.println(1);
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }
            };
            Future<List<String>> future = threadPoolExecutor.submit(new SofaTracerCallable<>(exampleQueryTask, sofaTraceContext));
            futures.add(future);
        }
        List<String> list = asyncQuery(latch, futures);
        return list;
    }
}
