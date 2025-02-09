package com.yijia.visual.service.chain;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 简介说明:责任链
 *
 * @author: biboyuzhou
 * @date: 2025/02/09 12:23:38
 * @version:1.0
 */
public class BizHandlerChain<T extends BaseContext> implements BizHandler<T> {
    /**
     * 节点名称
     */
    private String name;

    /**
     * 子处理链
     */
    private List<? extends BizHandler<T>> handlerChain;

    public BizHandlerChain(List<? extends BizHandler<T>> handlerChain, String name) {
        this.handlerChain = handlerChain;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean preCheck(T baseContext) {
        return true;
    }

    @Override
    public void handle(T baseContext, boolean shouldThrowException) {
        long beginTime = System.currentTimeMillis();
        if (CollectionUtils.isEmpty(handlerChain)) {
            System.out.println("责任链节点为空，跳过");
        }
        try {
            for (BizHandler<T> handler : handlerChain) {
                handler.handle(baseContext, shouldThrowException);
            }
        } catch (Exception e) {
            System.out.println("责任链处理异常:" + this.name);
            if (shouldThrowException) {
                throw e;
            }
            e.printStackTrace();
        } finally {
            System.out.println("BizHandlerChain-" + this.name + "costTime=" + (System.currentTimeMillis() - beginTime));
        }
    }

    @Override
    public void exceptionCallback(T baseContext) {

    }
}
