package com.wangqi.factory;

import com.wangqi.strategy.CandidateUpdateStrategy;
import com.wangqi.strategy.WeChatMessageStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 操作候选人触发推送消息 工厂  + 策略
 *
 * @author wangqi
 * @Date 2021-05-21
 */
@Component
public class CandidateUpdateFactory {

    private static CandidateUpdateFactory factory = new CandidateUpdateFactory();

    private CandidateUpdateFactory() {
    }

    private static Map<String, CandidateUpdateStrategy> strategy = new ConcurrentHashMap<>();

    static {
        strategy.put("weChat", new WeChatMessageStrategy());
    }

    public static CandidateUpdateFactory getInstance() {
        return factory;
    }

    public CandidateUpdateStrategy getStrategy(String component) {
        return strategy.get(component);
    }


}
