package com.yijia.visual.service.strategy2;

/**
 * 简介说明: 任务处理类型枚举
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 20:48:59
 * @version:1.0
 */
public enum HanderTypeEnum {
    FIRST_HANDLER("first", "first"),
    SECOND_HANDLER("second", "second"),
    THIRD_HANDLER("third", "third"),
   ;

    HanderTypeEnum(String scene, String desc) {
        this.scene = scene;
        this.desc = desc;
    }

    public static HanderTypeEnum getByScene(String scene) {
        for(HanderTypeEnum typeEnum : values()) {
            if (typeEnum.getScene().equals(scene)) {
                return typeEnum;
            }
        }
        return null;
    }

    private final String scene;

    private final String desc;

    public String getScene() {
        return scene;
    }

    public String getDesc() {
        return desc;
    }
}
