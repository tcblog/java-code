package com.itheima.constructor;

public class Car {
    String name;
    double price;


//    无参数构造器
    public  Car(){
        System.out.println("无参数");
    }

//    有参数构造器
    public  Car(String n,double p){
        System.out.println("有参数");
        name = n;
        price = p;
    }
}
