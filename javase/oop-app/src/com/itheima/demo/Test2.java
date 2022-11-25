package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        // 1.设计电影类
        // 2.创建 3 个电影对象，封装电影的信息


        // 3.定义一个电影类型的数组，存储电影对象
        Movie[] arr = new Movie[3];
        arr[0] = new Movie("长津湖",9.7,"吴京");
        arr[1] = new Movie("我和我的父辈",9.6,"吴京");
        arr[2] = new Movie("扑水少年",9.5,"王川");

        // 4。遍历数组的每个电影对象，然后展示
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getScore());
            System.out.println(arr[i].getActor());
            System.out.println("-------------------");
        }
    }
}
