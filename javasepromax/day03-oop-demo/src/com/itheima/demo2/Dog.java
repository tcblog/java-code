package com.itheima.demo2;

public class Dog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
