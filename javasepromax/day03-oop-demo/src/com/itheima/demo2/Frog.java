package com.itheima.demo2;

public class Frog extends Animal implements Swim {

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }
}
