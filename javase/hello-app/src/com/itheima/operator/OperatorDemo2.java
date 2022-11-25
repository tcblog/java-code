package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 拆分 三位数 ，输出个，十 ，百
        int data = 589;
        int ge = data % 10;
        System.out.println(ge);

        int shi =  data / 10 % 10; //  58.9  % 10  ====》 8
        System.out.println(shi);

        int bai = data / 100;  //  5.89  ====> 转成 int 所以是 5
        System.out.println(bai);
    }
}
