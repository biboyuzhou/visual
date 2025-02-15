package com.yijia.visual.service.async.task;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * 简介说明:抽象线程处理类
 *
 * @author: biboyuzhou
 * @date: 2025/02/15 15:02:59
 * @version:1.0
 */
public abstract class AbstractAsyncQueryTask<T> implements Callable<List<T>> {
    private String index;

    private String tableName;

    private CountDownLatch latch;

    public AbstractAsyncQueryTask(String index, String tableName, CountDownLatch latch) {
        this.index = index;
        this.tableName = tableName;
        this.latch = latch;
    }

    @Override
    public List<T> call() throws Exception {
        return null;
    }

    /**
     * 定义每个子任务具体的查询方式
     * @return
     * @throws Exception
     */
    protected abstract List<T> doCall() throws Exception;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }
}
