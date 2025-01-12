package com.yijia.visual.service.strategy2;

import java.util.List;

/**
 * 简介说明: 任务处理接口
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 20:48:59
 * @version:1.0
 */
public interface TaskHandler {

    boolean handle();

    List<HanderTypeEnum> getScenes();
}
