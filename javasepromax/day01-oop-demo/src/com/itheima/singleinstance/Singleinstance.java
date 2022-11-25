package com.itheima.singleinstance;

/**
 * 使用饿汉单例实现单例类
 */

public class Singleinstance {
    // 1 必须把构造器私有化
    private Singleinstance(){

    }
    // 饿汉单例是获取对象前，对象已经提前准备好了一个，这个对象只能是一个，所以定义静态成员变量
    public static Singleinstance instance = new Singleinstance();

}
