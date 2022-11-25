package com.itheima.test;

public class GoldCard extends Card {
    @Override
    public void pay(double money2) {
        System.out.println("当前消费：" + money2);
        System.out.println("卡片当前余额：" + getMoney());
        // 优惠价
        double rs = money2 * 0.8;
        System.out.println("实际支付：" + rs);
        // 更新账户余额
        setMoney(getMoney() - rs);
    }
}
