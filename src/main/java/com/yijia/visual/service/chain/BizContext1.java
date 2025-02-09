package com.yijia.visual.service.chain;

/**
 * 简介说明:业务上下文1
 *
 * @author: biboyuzhou
 * @date: 2025/02/09 12:35:44
 * @version:1.0
 */
public class BizContext1 extends BaseContext {
    private static final long serialVersionUID = 6686620382859717318L;

    private String userId;

    private String source;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
