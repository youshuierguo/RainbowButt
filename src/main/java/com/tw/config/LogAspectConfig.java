package com.tw.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspectConfig {

    @Pointcut("execution(* com.tw.controller..*.*(..))")
    public void webLog(){
    }

//    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        StringBuffer requestInfo = new StringBuffer();
        requestInfo.append("地址 : " + request.getRequestURL().toString()+"\n");
        requestInfo.append("IP : " + request.getRemoteAddr()+"\n");
        requestInfo.append("方法名 :"+joinPoint.getSignature()+"\n");
        requestInfo.append("请求参数 :"+ Arrays.toString(joinPoint.getArgs()));
        System.out.println("*******************************"+requestInfo);
    }

//    @After("webLog()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("**************************aop后置通知");
    }


    @Around("webLog()")
    public Object doArround(ProceedingJoinPoint joinPoint){
        try {
            Object obj = joinPoint.proceed();
            System.out.println("--------------环绕通知！！！！！！");
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
