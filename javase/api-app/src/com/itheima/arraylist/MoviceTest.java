package com.itheima.arraylist;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class MoviceTest {
    public static void main(String[] args) {
        // 1.定义电影类
        // 2.创建三个电影对象
        Movice m1 = new Movice("肖生客的救赎",9.7,"罗宾斯");
        Movice m2 = new Movice("霸王别姬",9.7,"张国荣");
        Movice m3 = new Movice("阿甘正传",9.5,"张国荣");

        // 3.定义一个电影类型的集合
        ArrayList<Movice> movices = new ArrayList<>();
        movices.add(m1);
        movices.add(m2);
        movices.add(m3);
//        System.out.println(movices);

        // 4。遍历输出
        for (int i = 0; i < movices.size(); i++) {
            System.out.print(movices.get(i).getName());
            System.out.print(movices.get(i).getScore());
            System.out.print(movices.get(i).getActor());
            System.out.println();
        }
    }
}
