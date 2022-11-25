package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person("老王",30);
//        Dog d = new Dog(2,"黑");
//        p.keepPet(d,"骨头");

        // 创建饲养员的对象
        Person p = new Person("老王",30);
        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"橘");
        p.keepPet(d,"骨头");
        p.keepPet(c,"鱼");
    }
}
