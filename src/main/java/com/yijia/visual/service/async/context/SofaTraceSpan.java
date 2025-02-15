package com.yijia.visual.service.async.context;

import io.opentracing.Span;
import io.opentracing.SpanContext;

import java.util.Map;

/**
 * 简介说明:
 *
 * @author: biboyuzhou
 * @date: 2025/02/15 14:56:42
 * @version:1.0
 */
public class SofaTraceSpan implements Span {
    public static final char ARRAY_SEPARATOR = '|';


    @Override
    public SpanContext context() {
        return null;
    }

    @Override
    public Span setTag(String s, String s1) {
        return null;
    }

    @Override
    public Span setTag(String s, boolean b) {
        return null;
    }

    @Override
    public Span setTag(String s, Number number) {
        return null;
    }

    @Override
    public Span log(Map<String, ?> map) {
        return null;
    }

    @Override
    public Span log(long l, Map<String, ?> map) {
        return null;
    }

    @Override
    public Span log(String s) {
        return null;
    }

    @Override
    public Span log(long l, String s) {
        return null;
    }

    @Override
    public Span setBaggageItem(String s, String s1) {
        return null;
    }

    @Override
    public String getBaggageItem(String s) {
        return null;
    }

    @Override
    public Span setOperationName(String s) {
        return null;
    }

    @Override
    public void finish() {

    }

    @Override
    public void finish(long l) {

    }
}
