package com.yijia.visual.service.chain.hanlder;

import com.yijia.visual.service.chain.BaseContext;
import com.yijia.visual.service.chain.BizHandler;

/**
 * 简介说明:业务处理器抽象基类
 *
 * @author: biboyuzhou
 * @date: 2025/02/09 12:45:23
 * @version:1.0
 */
public abstract class BaseBizHandler<T extends BaseContext> implements BizHandler<T> {

    /**
     * 抽象业务处理，具体处理器实现
     * @param baseContext
     * @param shouldThrowException
     */
    public abstract void doHandle(T baseContext, boolean shouldThrowException);

    @Override
    public void handle(T baseContext, boolean shouldThrowException) {
        long beginTime = System.currentTimeMillis();
        try {
            if (preCheck(baseContext)) {
                doHandle(baseContext, shouldThrowException);
            }
        } catch (Exception e) {
            System.out.println("责任链处理异常");
            try {
                exceptionCallback(baseContext);
            } catch (Exception callBackException) {
                System.out.println("callBackException");
            }
            if (shouldThrowException) {
                throw e;
            }
        } finally {
            System.out.println("处理时间" + (System.currentTimeMillis() - beginTime));
        }
    }
}
