package com.itheima.interface_implements;

/**
 * 实现类
 */

public class PingPongMan implements SportMan,Law{
    private String name;

    // 有参构造器
    public PingPongMan(String name){
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name + "必须跑步训练");
    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛");
    }

    @Override
    public void rule() {
        System.out.println(name + "必须守法");
    }
}
