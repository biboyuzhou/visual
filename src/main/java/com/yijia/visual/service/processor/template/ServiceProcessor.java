package com.yijia.visual.service.processor.template;

public interface ServiceProcessor {
    void preCheck();

    void process();

    void postProcess();
}
