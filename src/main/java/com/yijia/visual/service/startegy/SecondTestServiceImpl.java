package com.yijia.visual.service.startegy;


import org.springframework.stereotype.Service;

@Service
public class SecondTestServiceImpl extends AbstractTestServiceImpl {

    @Override
    protected void postProcess() {
        System.out.println("second test postProcess");
    }

    @Override
    public TestServiceTypeEnum getSupportType() {
        return TestServiceTypeEnum.SECOND_TEST;
    }
}
