package com.wangqi.controller;

import com.wangqi.factory.CandidateUpdateFactory;
import com.wangqi.strategy.CandidateUpdateStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author wang`qi
 */
@Controller
public class StrategyController {

    @Autowired
    CandidateUpdateFactory candidateUpdateFactory;

    @RequestMapping("/strategy")
    @ResponseBody
    public CandidateUpdateStrategy strategy(@RequestParam("key") String key) {
        CandidateUpdateStrategy result;
            result = candidateUpdateFactory.getStrategy(key);
            System.out.println(result);
        return result;
    }

}
