package com.yijia.visual.service.startegy;

public enum TestServiceTypeEnum {

    FIRST_TEST("first", "first test"),
    SECOND_TEST("second", "second test"),
    THIRD_TEST("third", "third test"),
    ;

    private final String code;

    private final String message;

    TestServiceTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

