package com.itheima.javabean;

public class User {
    public static void main(String[] args) {
        Student u1 = new Student();
        u1.setName("黑马吴彦祖");
        u1.setHeight(180.5);
        u1.setSalary(1000.0);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());
    }
}
