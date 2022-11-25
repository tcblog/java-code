package com.itheima.demo;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    // 饲养狗
//    public void keepPet(Dog dog,String somethind){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" +dog.getAge() + "的狗");
//        dog.eat(somethind);
//    }
//
//    // 饲养猫
//    public void keepPet(Cat cat,String somethind){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" +cat.getAge() + "的猫");
//        cat.eat(somethind);
//    }

    // 想要一个方法，能接收所有的动物，包括猫，包括狗
    // 方法的形参：可以写这些类的父类 Animal
    public void keepPet(Animal a,String somethind){

        if (a instanceof Dog d){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" +a.getAge() + "岁的狗");
            d.eat(somethind);
        }else if (a instanceof Cat c){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" +a.getAge() + "岁的猫");
            c.eat(somethind);
        }else {
            System.out.println("没有这种动物");
        }


    }

}
