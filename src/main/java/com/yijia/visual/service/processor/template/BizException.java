package com.yijia.visual.service.processor.template;

/**
 * 简介说明:自定义异常
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 21:49:19
 * @version:1.0
 */
public class BizException extends RuntimeException {
    private final BaseErrorEnum errorEnum;

    private boolean msgNeedDisplay;

    public BizException(BaseErrorEnum errorEnum, String msg) {
        super(msg);
        if (errorEnum == null) {
            throw new BizException(BaseErrorEnum.SUCCESS, "");
        }
        this.errorEnum = errorEnum;
    }

    public BaseErrorEnum getErrorEnum() {
        return errorEnum;
    }

    public boolean isMsgNeedDisplay() {
        return msgNeedDisplay;
    }
}
