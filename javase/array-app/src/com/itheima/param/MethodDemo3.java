package com.itheima.param;

public class MethodDemo3 {
    public static void main(String[] args) {
        int[] ages = {10,20,30,40};

        arrPrint(ages);
    }

    public static void arrPrint(int[] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
//            if (i == arr.length-1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ", ");

        }
        System.out.print("]");
    }
}
