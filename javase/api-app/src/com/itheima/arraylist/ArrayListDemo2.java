package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 加了<>后就变成了泛型
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("中国");
//        list.add(122);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(23);
//        list2.add("java");
    }
}
