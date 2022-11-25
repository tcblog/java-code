package com.itheima.demo;

public class ForTest1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};

        // 冒泡：每次从数组中找到一个最大值的放到最后面
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
