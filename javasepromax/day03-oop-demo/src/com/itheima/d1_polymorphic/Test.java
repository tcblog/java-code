package com.itheima.d1_polymorphic;

public class Test {
    public static void main(String[] args) {

        // 1.多态的形式、父类类型 对象名称 = new 子类构造器
        Animal a = new Dog();
        a.run();

        Animal a2 = new Tortoise();
        a2.run();
    }
}
