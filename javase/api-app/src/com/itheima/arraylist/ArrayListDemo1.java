package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("java");
        list.add("黑马");
        list.add(23);
        list.add(23.11);
        list.add(false);
        System.out.println(list.add("Ab"));
        System.out.println(list);


        // 给指定索引位置插入元素
        list.add(0,"mysql");
        System.out.println(list);
    }
}
