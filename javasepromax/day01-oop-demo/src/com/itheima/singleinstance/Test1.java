package com.itheima.singleinstance;

public class Test1 {
    public static void main(String[] args) {
    Singleinstance s1 = Singleinstance.instance;
    Singleinstance s2 = Singleinstance.instance;
    System.out.println(s1 == s2);

    }
}
