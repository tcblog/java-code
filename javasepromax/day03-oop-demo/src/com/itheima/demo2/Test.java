package com.itheima.demo2;

public class Test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Frog f = new Frog("小绿",1);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        // 创建兔子对象
        Rabbit r = new Rabbit("垂耳兔",2);
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();

        // 创建狗对象
        Dog d = new Dog("田园",2);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.swim();
    }
}
