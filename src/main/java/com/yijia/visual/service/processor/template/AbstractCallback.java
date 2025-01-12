package com.yijia.visual.service.processor.template;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 简介说明:抽象回调
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 21:35:10
 * @version:1.0
 */
public abstract class AbstractCallback {
    public AbstractCallback() {

    }
    protected void preCheck() {

    }
    protected abstract String action();

    protected abstract BaseResp process();
}
