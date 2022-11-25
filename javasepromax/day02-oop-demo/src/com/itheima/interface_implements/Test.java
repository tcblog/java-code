package com.itheima.interface_implements;

public class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan("张三");
        p.run();
        p.competition();

        // 另一个接口
        p.rule();
    }

}
