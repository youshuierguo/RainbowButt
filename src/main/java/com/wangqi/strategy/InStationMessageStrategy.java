package com.wangqi.strategy;

import org.springframework.stereotype.Component;

/**
 * 推送站内信
 * @author wangqi
 * @Date 2021-05-21
 */
@Component("inStation")
public class InStationMessageStrategy extends CandidateUpdateStrategy {


    @Override
    public String pushInStationMessage() {
        System.out.println("推送站内信");
        //业务逻辑
        return "inStation";
    }
}
