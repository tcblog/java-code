package com.itheima.d1_polymorphic_test;

public class Test {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer c = new Computer("外星人");
        c.start();

        //创建鼠标对象，键盘对象
        USB u = new Mouse("双飞燕");
        c.installUSB(u);
    }
}
