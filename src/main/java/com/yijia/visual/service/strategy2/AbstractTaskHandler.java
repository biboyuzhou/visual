package com.yijia.visual.service.strategy2;

import org.springframework.beans.factory.InitializingBean;

/**
 * 简介说明: 任务处理抽象实现类
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 20:48:59
 * @version:1.0
 */
public abstract class AbstractTaskHandler implements TaskHandler, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        TaskProcessFactory.register(this);
    }
}
