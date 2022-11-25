package com.itheima.string;

public class OtherDemo2 {
    public static void main(String[] args) {
        String name = "我爱中国love";
        System.out.println(name.length());

        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("----------------");

        // 遍历字符串中的每一个字符
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        System.out.println("----------------");
        char[] chars = name.toCharArray();
        System.out.println(chars);
    }
}
