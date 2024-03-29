package com.wangqi.controller;

import com.wangqi.service.HelloService;
import com.wangqi.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wang`qi
 */
@Controller
@Component
@Slf4j
public class HelloController {
    @Autowired
    HelloService helloService;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        User user = helloService.getHello();
        System.out.println("controller类被调用-------------");
//        int i = 1/0;
        return "你好,百度！"+user.getUserName();
    }
}
