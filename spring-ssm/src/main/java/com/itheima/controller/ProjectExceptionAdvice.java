package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 声明这个类用来做Rest风格异常处理的
@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 处理全部 Exception 类型异常
    @ExceptionHandler(Exception.class)
    public void doExeption(Exception ex){
        System.out.println("非法访问！");
    }
}
