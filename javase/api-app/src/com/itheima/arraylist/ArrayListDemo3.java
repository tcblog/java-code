package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("js");

        // 获取某个索引位置处的元素
        System.out.println(list.get(2));        // js

        // 获取集合的大小
        System.out.println(list.size());        // 3

        System.out.println("----------------------");

        // 完成集合的遍历
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("----------------------");

        // 删除某个位置的位置，并返回这个元素
        System.out.println(list.remove(0));  // java
        System.out.println(list.get(0));        // python
    }
}
