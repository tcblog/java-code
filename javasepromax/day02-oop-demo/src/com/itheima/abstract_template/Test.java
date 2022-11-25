package com.itheima.abstract_template;

public class Test {
    public static void main(String[] args) {
        StudentMiddle s1 = new StudentMiddle();
        s1.write();

        System.out.println("-----------------------");

        StudentChild s2 = new StudentChild();
        s2.write();
    }
}
