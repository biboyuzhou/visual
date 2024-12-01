package com.yijia.visual.service.strategy1;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HandlerFactory {

    private final static Map<HanderTypeEnum, TestHandler> HANDLER_MAP = new ConcurrentHashMap<>();

    public static TestHandler getHandler(String sceneCode) {
        return HANDLER_MAP.get(sceneCode);
    }

    public static void register(TestHandler testHandler) {
        List<HanderTypeEnum> scenes = testHandler.getScenes();
        for(HanderTypeEnum scene : scenes) {
            if (!HANDLER_MAP.containsKey(scene)) {
                HANDLER_MAP.put(scene, testHandler);
                System.out.println(scene + "注册成功");
            }
        }
    }
}
