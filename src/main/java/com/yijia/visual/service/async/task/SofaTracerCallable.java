package com.yijia.visual.service.async.task;

import com.yijia.visual.service.async.context.SofaTraceContext;
import com.yijia.visual.service.async.context.SofaTraceSpan;

import java.util.concurrent.Callable;

/**
 * 简介说明:
 *
 * @author: biboyuzhou
 * @date: 2025/02/15 15:18:03
 * @version:1.0
 */
public class SofaTracerCallable<T> implements Callable<T> {
    private long tid = Thread.currentThread().getId();
    private Callable<T> wrappedCallable;
    private SofaTraceContext traceContext;
    private SofaTraceSpan currentSpan;

    public SofaTracerCallable(Callable<T> wrappedCallable, SofaTraceContext sofaTraceContext) {
        this.initCallable(wrappedCallable, sofaTraceContext);
    }

    private void initCallable(Callable<T> wrappedCallable, SofaTraceContext sofaTraceContext) {
        this.wrappedCallable = wrappedCallable;
        this.traceContext = sofaTraceContext;
        if (!traceContext.isEmpty()) {
            //this.currentSpan = traceContext.getCurrentSpan();
        }
    }

    @Override
    public T call() throws Exception {
        if (Thread.currentThread().getId() != this.tid && this.currentSpan != null) {
            this.traceContext.push();
        }
        this.wrappedCallable.call();
        return null;
    }
}
