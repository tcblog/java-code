package com.itheima.static_code;

import java.sql.Array;
import java.util.ArrayList;

public class StaticTest1 {

    /**
     * 1.定义一个静态的集合，这样这个集合只加载 一个 因为当前房价只需要一副牌
     */
    // public 任何地方都可以访问 公开的、共享的  private 只能本类访问 私有
    // static 声明为静态集合
    public static ArrayList<String> cards = new ArrayList<>();

    /**
     * 在程序运行main方法前，把54张牌放进去，后续游戏可以直接使用
     *
     */
    static {
        // 3.正式做牌，放到集合中去
        // 定义一个数组存储全部点数，类型确定了，个数确定了
        String[] sizes = {"3","4","5"};
        // 定义一个数组存储全部花色
        String[] colors = {"♥","♣"};
        // 遍历点数
        for (int i = 0; i < sizes.length; i++) {
            // 遍历花色
            for (int j = 0; j < colors.length; j++) {
                // 一张牌
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        // 单独加入大小王
        cards.add("小王");
        cards.add("大王");
    }

    public static void main(String[] args) {
        System.out.println("新牌" + cards);
    }
}
