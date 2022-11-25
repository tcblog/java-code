package com.itheima.memory;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉，游戏，学习";
        s1.study();

        Student s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

        s2.hobby = "爱提问";
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s2.hobby);
        s2.study();
    }
}
