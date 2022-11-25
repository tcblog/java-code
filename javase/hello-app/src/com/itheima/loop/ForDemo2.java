package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        for (int i = 100;i<=999;i++){
            int ge = i % 10;

            int shi = i / 10 % 10;  ///   999 / 10  = int 99

            int bai = i / 100;


            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                System.out.print(i + "\t");
//                System.out.println(i);
            }
        }
    }
}
