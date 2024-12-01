package com.yijia.visual.service.strategy1;

public enum HanderTypeEnum {
    FIRST_HANDLER("first", "first"),
    SECOND_HANDLER("second", "second"),
    THIRD_HANDLER("third", "third"),
   ;

    HanderTypeEnum(String scene, String desc) {
        this.scene = scene;
        this.desc = desc;
    }

    private String scene;

    private String desc;

    public String getScene() {
        return scene;
    }

    public String getDesc() {
        return desc;
    }
}
