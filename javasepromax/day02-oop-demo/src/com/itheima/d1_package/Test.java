package com.itheima.d1_package;

// 导包
import com.itheima.d1_package.it.Student;

public class Test {
    public static void main(String[] args) {
        // 同一个包下的类，互相可以直接访问
        System.out.println(User.onlineNumber);

        // 不同包下的类，必须先导包才可以访问

    }
}
