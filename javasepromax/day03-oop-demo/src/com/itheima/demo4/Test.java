package com.itheima.demo4;

public class Test {
    public static void main(String[] args) {
        // 创建运动员或教练对象

        PingPangSporter pps = new PingPangSporter("刘诗雯",23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();

        BasketballCoach bbs = new BasketballCoach("张三",20);
        bbs.teach();

        PingPangCoach ppc = new PingPangCoach("王五",21);
        ppc.teach();
        ppc.speakEnglish();

    }
}
