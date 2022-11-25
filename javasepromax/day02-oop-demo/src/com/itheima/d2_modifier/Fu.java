package com.itheima.d2_modifier;

public class Fu {
    // 1.定义私有成员，private只能本类中访问
    private void privateMethod(){
        System.out.println("--private---");
    }

    // 2.定义缺省修饰的成员，只能本类中、同包下访问（包访问权限）
    void method(){
        System.out.println("---缺省---");
    }

    // 3.protected修饰的方法
    protected void protectedMethod(){
        System.out.println("---protected---");
    }

    // 4.public修饰的方法，本类、同包，其他包
    public void publicMethod(){
        System.out.println("---public---");
    }

    public static void main(String[] args) {
        // 本类中都可以访问
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.privateMethod();
        f.publicMethod();
    }
}
