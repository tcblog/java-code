package com.itheima.param;

public class MethodDemo5 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {10,20,30};

        System.out.println(compare(arr1,arr2));
    }

    public static boolean compare(int[] arr1,int[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0;i<arr1.length;i++){
                if (arr1[i] != arr2[i]){
                    return false;      // 内容不一样
                }
            }
            return true;
        }else {
            return false;   // 长度不一样
        }
    }
}
