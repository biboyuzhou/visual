package com.yijia.visual.service.strategy1;

import java.util.List;

public interface TestHandler {
    boolean handle();

    List<HanderTypeEnum> getScenes();
}
