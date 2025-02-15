package com.yijia.visual.service.async.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 简介说明:
 *
 * @author: biboyuzhou
 * @date: 2025/02/15 15:07:51
 * @version:1.0
 */
public class ExampleQueryTask extends AbstractAsyncQueryTask<String>{
    private String id;

    public ExampleQueryTask(String index, String tableName, CountDownLatch latch, String id) {
        super(index, tableName, latch);
        this.id = id;
    }

    @Override
    public List<String> call() throws Exception {
        return super.call();
    }

    @Override
    protected List<String> doCall() throws Exception {
        List<String> result = new ArrayList<>();
        result.add("1");
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
