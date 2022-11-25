package com.itheima.interfaceDemo;

/**
 * 声明了一个接口，体现一种规范，规范一定是公开的
 */
public interface InterfaceDemo {

    // 1. 常量
    public static final String SHCOOL_NAME = "黑马程序员";

    // 2.抽象方法
    // 注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public abstrcat 可以省略不写
//    public abstract void run();
    void run();
//    public abstract void eat();
    void eat();
}
