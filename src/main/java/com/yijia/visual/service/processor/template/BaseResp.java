package com.yijia.visual.service.processor.template;

import java.io.Serializable;

/**
 * 简介说明:通用返回基类
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 21:31:37
 * @version:1.0
 */
public class BaseResp<T> implements Serializable {
    private static final long serialVersionUID = -1049088813743090504L;

    private boolean success;
    private String resultCode;
    private String resultDesc;
    private String toast;

    private T resultObj;

    public static <E> BaseResp<E> createCommonErrorResult(String resultCode, String resultDesc) {
        BaseResp<E> r = new BaseResp<E>();
        r.setResultCode(resultCode);
        r.setResultDesc(resultDesc);
        return r;
    }

    public static  <E> BaseResp<E> createSuccessResult(E data) {
        BaseResp<E> r = new BaseResp<E>();
        r.setSuccess(true);
        r.setResultObj(data);
        return r;
    }

    public BaseResp() {

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getToast() {
        return toast;
    }

    public void setToast(String toast) {
        this.toast = toast;
    }

    public T getResultObj() {
        return resultObj;
    }

    public void setResultObj(T resultObj) {
        this.resultObj = resultObj;
    }
}
