package com.itheima.Method;

public class MethodDemo1 {
    public static void main(String[] args) {

        study();

    }


    public static int sum(int a,int b){
        int c= a + b;
        return c;
    }

    public static void eat(){
        System.out.println("吃饭");
    }

    public static void sleep(){
        System.out.println("睡觉");
    }

    public static void study(){
        eat();
        System.out.println("学习");
        sleep();
    }
}
