package com.itheima.javabean;

public class Test {
    // 1.成员变量建议使用 private私有
    private String name;
    private double height;
    private double salary;

    // 4.无参数构造器
    public Test() {
    }


    // 3.有参数构造器，此时创建出来后，无参数构造器就没有了，所以要提供一个无参数构造器
    public Test(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }


    // 2.必须提供成套的方法

    // 有返回值 类型 String
    public String getName() {
        return name;
    }

    // 无返回值 类型 void
    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
