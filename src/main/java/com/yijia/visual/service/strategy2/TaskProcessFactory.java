package com.yijia.visual.service.strategy2;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 简介说明:任务处理工厂
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 20:52:29
 * @version:1.0
 */
public class TaskProcessFactory {

    private final static Map<HanderTypeEnum, TaskHandler> HANDLER_MAP = new ConcurrentHashMap<>();

    public static TaskHandler getHandler(String scene) {
        return HANDLER_MAP.get(HanderTypeEnum.getByScene(scene));
    }

    public static void register(TaskHandler taskHandler) {
        List<HanderTypeEnum> scenes = taskHandler.getScenes();
        for(HanderTypeEnum typeEnum : scenes) {
            if (!HANDLER_MAP.containsKey(typeEnum)) {
                HANDLER_MAP.put(typeEnum, taskHandler);
            }
        }
    }
}
