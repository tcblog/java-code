package com.itheima.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String name = "传智播客";
        name += "教育";
        name += "中心";
        System.out.println(name);

        // 通过构造器
        String s1 = new String();
        System.out.println(s1);
        String s2 = "";
        System.out.println(s2);

        // 根据字符数组的内容，创建字符串对象
        char[] chars = {'a','b','中','国'};
        String s3 = new String(chars);
        System.out.println(s3);

        // 根据字节数组的内容，创建字符串对象
        byte[] bytes = {97,98,99,65,66,67};
        String s4 = new String(bytes);
        System.out.println(s4);

        char[] chars1 = {'a','b','c'};
        String ss3 = new String(chars1);
        String ss4 = new String(chars1);
        System.out.println(ss3 == ss4);
    }
}
