package com.yijia.visual.service.chain;

/**
 * 业务责任链类型枚举
 */
public enum BizChainEnum {
    BIZ_CHAIN_1("BizChain1", "第一个"),
    BIZ_CHAIN_2("BizChain2", "第二个");

    private String code;

    private String desc;

    BizChainEnum (String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
