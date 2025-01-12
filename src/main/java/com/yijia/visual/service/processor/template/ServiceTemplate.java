package com.yijia.visual.service.processor.template;

import org.springframework.util.StopWatch;

/**
 * 简介说明:service统一处理脚手架
 *
 * @author: biboyuzhou
 * @date: 2025/01/12 21:10:34
 * @version:1.0
 */
public class ServiceTemplate {
    public ServiceTemplate() {

    }

    public static <T> void execute(T request, BaseResp response, ServiceProcessor serviceProcessor) {
        try {
            serviceProcessor.preCheck();
            serviceProcessor.process();
        } catch (BizException bizException) {
            BaseResp.createCommonErrorResult(bizException.getErrorEnum().getCode(), bizException.getMessage());
        } catch (Exception e) {
            BaseResp.createCommonErrorResult(BaseErrorEnum.SYSTEM_ERROR.getCode(), e.getMessage());
        } finally {
            try {
                serviceProcessor.postProcess();
            } catch (Exception e) {

            }
        }
    }

    /*public static <RESULT extends BaseResp> RESULT T invoke(BaseReq request, Class<RESULT> resultClass, AbstractCallback callback, String... args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        BaseResp result;
        try {
            result = (BaseResp) resultClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("");
        }
        boolean isSuccess = false;
        Object errorCode = null;
        boolean var19 = false;

    }*/
}
