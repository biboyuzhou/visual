package com.yijia.visual.service.strategy1;

import org.springframework.beans.factory.InitializingBean;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHandlerImpl implements TestHandler, InitializingBean {

    protected List<HanderTypeEnum> getList(HanderTypeEnum handerTypeEnum) {
        List<HanderTypeEnum> list = new ArrayList<>(1);
        list.add(handerTypeEnum);
        return list;
    }

    /**
     * bean 注册
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        HandlerFactory.register(this);
    }
}
