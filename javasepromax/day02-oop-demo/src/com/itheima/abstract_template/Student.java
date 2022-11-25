package com.itheima.abstract_template;

public abstract class Student {
    /**
     * 声明了模板方法模式
     */
    public void write(){
        System.out.println("\t\t\t\t<我的爸爸>");
        System.out.println("你爸爸是啥样，来说说：");

        // 正文(每个子类都要写的，每个子类写的内容都不一样)
        // 因此，模板方法 把 正文部分定义成抽象方法，交给具体的子类来完成
        System.out.println(writeMain());

        System.out.println("我的爸爸太好了");
    }

    // 抽象方法
    public abstract String writeMain();
}
