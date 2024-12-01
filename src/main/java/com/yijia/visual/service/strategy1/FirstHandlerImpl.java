package com.yijia.visual.service.strategy1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstHandlerImpl extends AbstractHandlerImpl{
    @Override
    public boolean handle() {
        return false;
    }

    @Override
    public List<HanderTypeEnum> getScenes() {
        return getList(HanderTypeEnum.FIRST_HANDLER);
    }
}
