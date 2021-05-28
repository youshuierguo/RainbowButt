package com.wangqi.strategy;


import org.springframework.stereotype.Component;

/**
 * 候选人操作触发
 * 
 * @author code Generator
 * @date 2021-05-21
 */
public  abstract class CandidateUpdateStrategy {

    /**
     * 推送企微消息
     *
     * @return
     */
    String pushWeChatMessage() {
        return null;
    }

    /**
     * 推送站内信
     *
     * @return
     */
    String pushInStationMessage() {
        return null;
    }

}
