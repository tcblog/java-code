package com.itheima.constructor;

public class Dog extends Animal {
    public Dog(){
        super();    // 写不写都默认存在、默认找父类的无参数构造器执行
        System.out.println("Dog子类 无参构造器执行");
    }

    public Dog(String name){
        super();    // 写不写都默认存在、默认找父类的无参数构造器执行
        System.out.println("Dog子类 有参构造器执行");
    }
}
