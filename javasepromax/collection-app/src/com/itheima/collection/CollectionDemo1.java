package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/*
    目标：明确Collection集合体系特点
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
//        Collection list = new ArrayList();
//        list.add("java");
//        list.add("java");
//        list.add("123");
//
//        System.out.println(list);


        Collection<String> lists = new ArrayList<>();
        lists.add("java");
        lists.add("python");
        lists.add("c");
        lists.add("c++");
        System.out.println(lists);
        // [java,python,c,c++]
        //  it

        // 1.得到当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        // 2.定义while循环
//        while (it.hasNext()){
//           String ele = it.next();
//           System.out.println(ele);
//        }

        for (String ele : lists){
            System.out.println(ele);
        }

        System.out.println("------------------------");

        /*double[] scores = {100,99.5,59.5};
        for (double score : scores) {
            System.out.println(score);
        }*/

        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
