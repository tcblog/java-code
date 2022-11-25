package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 2.定义Controller
// 2.1 使用 @Controller 定义 bean
@Controller
//@RequestMapping("/user")
public class UserController {

    // 2.2 设置当前操作的访问路径
    @RequestMapping("/commonParam")
    // 2.3 设置当前操作的返回值类型
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递name="+ name);
        System.out.println("普通参数传递age="+ age);
        return "{'info':'common param'}";
    }

    @RequestMapping("/delete1")
    // 2.3 设置当前操作的返回值类型
    @ResponseBody
    public String delete1(){
        System.out.println("user delete...");
        return "{'info':'springmvc delete user'}";
    }
}
