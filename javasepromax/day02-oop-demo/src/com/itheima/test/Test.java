package com.itheima.test;

public class Test {
    public static void main(String[] args) {
        GoldCard u1 = new GoldCard();
        u1.setMoney(10000);
        u1.setUserName("张三");

        u1.pay(3000);
        System.out.println("剩余:" + u1.getMoney());
    }
}
