package com.yijia.visual.service.chain;

public interface BizHandler<T extends BaseContext> {
    String getName();

    boolean preCheck(T baseContext);

    void handle(T baseContext, boolean shouldThrowException);

    void exceptionCallback(T baseContext);
}
