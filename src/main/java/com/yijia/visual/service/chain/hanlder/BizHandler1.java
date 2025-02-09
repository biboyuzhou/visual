package com.yijia.visual.service.chain.hanlder;

import com.yijia.visual.service.chain.BizContext1;
import org.springframework.stereotype.Service;

/**
 * 简介说明:第一个业务处理器
 *
 * @author: biboyuzhou
 * @date: 2025/02/09 12:56:35
 * @version:1.0
 */
@Service
public class BizHandler1 extends BaseBizHandler<BizContext1>{

    @Override
    public String getName() {
        return "bizHandler1";
    }

    @Override
    public boolean preCheck(BizContext1 baseContext) {
        return true;
    }

    @Override
    public void exceptionCallback(BizContext1 baseContext) {

    }

    @Override
    public void doHandle(BizContext1 baseContext, boolean shouldThrowException) {
        System.out.println("bizHandler1 doHandle");
    }
}
