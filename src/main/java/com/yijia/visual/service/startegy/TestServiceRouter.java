package com.yijia.visual.service.startegy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class TestServiceRouter implements ApplicationContextAware {
    private final Map<TestServiceTypeEnum, TestService> strategyMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, TestService> map = applicationContext.getBeansOfType(TestService.class);
        for (TestService testService : map.values()) {
            TestServiceTypeEnum testServiceTypeEnum = testService.getSupportType();
            if (Objects.isNull(testServiceTypeEnum)) {
                continue;
            }
            Assert.isTrue(!strategyMap.containsKey(testServiceTypeEnum), testServiceTypeEnum + "存在多个，目前只支持一个");
            strategyMap.put(testServiceTypeEnum, testService);
        }
    }

    /**
     * 根据类型路由具体的策略
     * @param testServiceTypeEnum
     * @return
     */
    public TestService getTestService(TestServiceTypeEnum testServiceTypeEnum) {
        TestService testService = strategyMap.get(testServiceTypeEnum);
        if (Objects.nonNull(testService)) {
            return testService;
        }
        throw new RuntimeException("找不到对应的策略");
    }
}
