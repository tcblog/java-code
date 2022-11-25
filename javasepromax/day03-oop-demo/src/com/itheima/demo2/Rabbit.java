package com.itheima.demo2;

public class Rabbit  extends Animal{

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }
}
