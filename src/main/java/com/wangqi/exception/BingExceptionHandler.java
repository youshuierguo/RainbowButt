package com.wangqi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class BingExceptionHandler {

//    //自定义异常返回对应编码 😊
//    @ExceptionHandler()
//    @ResponseBody
//    public ResultModel handlerBingException(BingException e) {
//        return new ResultModel(false, "token_outtime");
//    }
//
//    //其他异常报对应的信息
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public ResultModel handlerSellException(Exception e) {
//        return new ResultModel(false, "系统出错，错误信息为：" + e.getMessage());
//    }
}
