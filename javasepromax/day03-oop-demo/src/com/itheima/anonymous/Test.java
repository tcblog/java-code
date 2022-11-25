package com.itheima.anonymous;



public class Test {
    public static void main(String[] args) {

    }
}

class Tiger extends Animal{
    @Override
    public void run() {
        System.out.println("老虎跑得快");
    }
}

abstract class Animal{
    public abstract void run();
}
