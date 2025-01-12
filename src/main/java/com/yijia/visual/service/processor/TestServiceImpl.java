package com.yijia.visual.service.processor;

import com.yijia.visual.service.processor.template.BaseResp;
import com.yijia.visual.service.processor.template.ServiceProcessor;
import com.yijia.visual.service.processor.template.ServiceTemplate;

/**
 * 简介说明:
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 21:10:03
 * @version:1.0
 */
public class TestServiceImpl implements TestService{
    @Override
    public BaseResp<Boolean> test(TestReq req) {
        BaseResp<Boolean> resp = new BaseResp<>();
        resp.setSuccess(true);
        ServiceTemplate.execute(req, resp, new ServiceProcessor() {
            @Override
            public void preCheck() {

            }

            @Override
            public void process() {

            }

            @Override
            public void postProcess() {

            }
        });
        return resp;
    }
}
