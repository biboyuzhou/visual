package com.yijia.visual.service.strategy2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 简介说明:第二种任务处理策略
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 20:48:59
 * @version:1.0
 */
@Service("SecondHandlerImpl2")
public class SecondHandlerImpl extends AbstractTaskHandler {
    @Override
    public boolean handle() {
        return false;
    }

    @Override
    public List<HanderTypeEnum> getScenes() {
        List<HanderTypeEnum> typeEnumList = new ArrayList<>(1);
        typeEnumList.add(HanderTypeEnum.SECOND_HANDLER);
        return typeEnumList;
    }
}
