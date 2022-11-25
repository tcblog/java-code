package com.itheima.string;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        int count = 0;
        while (count<3) {
            String okName = "admin";
            String okPassword = "0000";

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入名称：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (okName.equals(name) && okPassword.equals(password)){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("登录失败！");
                count++;
            }
        }

    }
}
