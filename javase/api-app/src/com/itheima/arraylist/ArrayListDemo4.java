package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(100);
        scores.add(56);
        scores.add(34);
        System.out.println(scores);

        // 把低于 80 分的 删掉  方法1
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i)<80){
                scores.remove(i);

                i--;       // 此处解决 删掉后 跳过这个位置，
            }
        }
        System.out.println(scores);


        // 方法2  从后往前删，删掉这个值后，后面的数据会往前填充，然后后面的值都是扫描遍历过的，所以不会影响
        for (int i = scores.size()-1;i >= 0;i--){
            if (scores.get(i) < 80){
                scores.remove(i);
            }
        }
    }
}
