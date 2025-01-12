package com.yijia.visual.service.processor.template;

import java.io.Serializable;

/**
 * 简介说明:请求基类
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 21:12:17
 * @version:1.0
 */
public class BaseReq implements Serializable {
    private static final long serialVersionUID = -3476796857479210470L;

    private String systemName;

    private String userId;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if (!(o instanceof BaseReq)) {
            return false;
        } else {
            BaseReq other = (BaseReq) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$systemName = this.getSystemName();
                Object other$systemName = other.getSystemName();
                if (this$systemName == null) {
                    if (other$systemName != null) {
                        return false;
                    }
                } else if (!this$systemName.equals(other$systemName)) {
                    return false;
                }

                Object this$userId = this.getUserId();
                Object other$userId = other.getUserId();
                if (this$userId == null) {
                    if (other$userId != null) {
                        return false;
                    }
                } else if (!this$userId.equals(other$userId)) {
                    return false;
                }
                return true;
            }

        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseReq;
    }

    public int hashCode() {
        int result = 1;
        Object $systemName = this.getSystemName();
        result = result * 59 + ($systemName == null ? 43 : $systemName.hashCode());
        Object $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        return result;
    }

    public String toString() {
        return "BaseReq(super=" + super.toString() + ", systemName=" + this.getSystemName() + ", userId=" + this.getUserId() + ")";
    }
}
