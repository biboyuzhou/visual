package com.yijia.visual.service.startegy;


import org.springframework.stereotype.Service;

@Service
public class ThirdTestServiceImpl extends AbstractTestServiceImpl {

    @Override
    protected void postProcess() {
        System.out.println("third test postProcess");
    }

    @Override
    public TestServiceTypeEnum getSupportType() {
        return TestServiceTypeEnum.THIRD_TEST;
    }
}
