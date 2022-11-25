package com.itheima.string;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入手机号码：");
        String tel = sc.next();


        String before = tel.substring(0,3);
        String after = tel.substring(7);    // 从索引7 开始截到末尾

        String  s = before + "****" + after;
        System.out.println(s);
    }
}
