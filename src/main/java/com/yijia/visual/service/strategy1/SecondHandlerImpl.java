package com.yijia.visual.service.strategy1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondHandlerImpl extends AbstractHandlerImpl{
    @Override
    public boolean handle() {
        return false;
    }

    @Override
    public List<HanderTypeEnum> getScenes() {
        return getList(HanderTypeEnum.SECOND_HANDLER);
    }
}
