package com.itheima.string;

import java.util.Scanner;

public class StringEqualsDemo1 {
    public static void main(String[] args) {
        String okName = "admin";
        String okPassword = "123";

        Scanner sc = new Scanner(System.in);
        System.out.println("输入名称：");
        String name =  sc.next();
        System.out.println("输入密码：");
        String password = sc.next();

        if (okName.equals( name ) && okPassword.equals(password)){
            System.out.println("登录成功！");
        }else{
            System.out.println("登录失败");
        }
    }
}
