package com.yijia.visual.service.processor.template;

public enum BaseErrorEnum {
    SUCCESS("", ""),
    SYSTEM_ERROR("", "")
    ;

    BaseErrorEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private final String code;

    private final String desc;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
