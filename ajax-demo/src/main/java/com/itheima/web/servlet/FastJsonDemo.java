package com.itheima.web.servlet;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {
        // 1.将Java对象转换为JSON字符串
        User user = new User();
        user.setId(1);
        user.setUsername("zs");
        user.setPassword("123");

        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);

        // 2.将JSON字符串转换为JAVA对象
        User u = JSON.parseObject(jsonString, User.class);
        System.out.println(u);
    }
}



