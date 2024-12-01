package com.yijia.visual.service.startegy;


import org.springframework.stereotype.Service;

@Service
public class FirstTestServiceImpl extends AbstractTestServiceImpl {

    @Override
    protected void postProcess() {
        System.out.println("first test postProcess");
    }

    @Override
    public TestServiceTypeEnum getSupportType() {
        return TestServiceTypeEnum.FIRST_TEST;
    }
}
