package com.yijia.visual.service.chain;

import com.yijia.visual.service.chain.hanlder.BizHandler1;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 简介说明:责任链处理器工厂
 *
 * @author: biboyuzhou
 * @date: 2025/02/09 13:00:11
 * @version:1.0
 */
public class ChainFactory {
    @Autowired
    private BizHandler1 bizHandler1;

    Map<String, BizHandlerChain> bizHandlerChainMap = new HashMap<>();

    @PostConstruct
    private void initialChain() {
        List<BizHandler<BizContext1>> bizHandlerList = new ArrayList<>();
        bizHandlerList.add(bizHandler1);
        BizHandlerChain<BizContext1> bizHandlerChain = new BizHandlerChain<>(bizHandlerList, BizChainEnum.BIZ_CHAIN_1.getCode());
        bizHandlerChainMap.put(BizChainEnum.BIZ_CHAIN_1.getCode(), bizHandlerChain);
    }

    public BizHandlerChain getBizHandlerChain(BizChainEnum bizChainEnum) {
        return bizHandlerChainMap.get(bizChainEnum.getCode());
    }
}
