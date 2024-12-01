package com.yijia.visual.service.startegy;

public abstract class AbstractTestServiceImpl implements TestService{
    @Override
    public void testService() {
        //1. preCheck
        preCheck();

        //2.
        doProcess();

        //3.postProcess
        postProcess();

        System.out.println("abstract impl");
    }

    protected abstract void postProcess();

    protected void doProcess() {

    }

    protected void preCheck() {

    }
}
