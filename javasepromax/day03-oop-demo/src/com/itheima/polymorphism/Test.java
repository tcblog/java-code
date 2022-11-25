package com.itheima.polymorphism;

public class Test {
    public static void main(String[] args) {
        // 创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(20);

        Administrator a = new Administrator();
        a.setName("管理员");
        a.setAge(35);

        register(s);
        register(t);
        register(a);
    }

    // 这个方法既能接收老师，接收学生，还接收管理员
    // 只能把参数写成这三个类型的父类
    public  static void register(Person p){
        p.show();
    }
}
