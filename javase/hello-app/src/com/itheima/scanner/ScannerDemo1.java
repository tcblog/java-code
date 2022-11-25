package com.itheima.scanner;
// 1,  导包操作（不需要自己写,以后通过工具更方便）


import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        // 调用sc 对象的功能等待接收用户输入的数据
        // 这个代码会等待用户输入的数据，并按了回车键，就会把数据拿到
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("年龄是" + age);

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("姓名是" + name);
    }
}
