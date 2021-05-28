package com.wangqi.strategy;

import org.springframework.stereotype.Component;

/**
 * 推送企微消息
 * @author wangqi
 * @Date 2021-05-21
 */
@Component("weChat")
public  class WeChatMessageStrategy extends CandidateUpdateStrategy {

    @Override
    public String pushWeChatMessage() {
        System.out.println("推送企微消息");
        //业务逻辑
        return "weChat";
    }



}
