package com.yijia.visual.service.processor;

import com.yijia.visual.service.processor.template.BaseResp;

public interface TestService {
    BaseResp<Boolean> test(TestReq req);
}
