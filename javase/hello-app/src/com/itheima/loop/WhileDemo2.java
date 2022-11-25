package com.itheima.loop;

public class WhileDemo2 {
    public static void main(String[] args) {
        double Height = 8848860;
        double Thickness = 0.1;

        int cout = 0;
        while (Thickness < Height){
            Thickness *= 2;
            cout++;
        }
        System.out.println(cout);
    }
}
