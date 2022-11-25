package com.itheima.param;

public class MethodDemo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};

        System.out.println(getArray(arr,100));
    }

    public static int getArray(int[] arr,int data){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == data){
                return i;
            }
        }
        return -1;      //  查无此元素
    }
}
