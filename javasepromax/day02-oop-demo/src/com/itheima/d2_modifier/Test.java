package com.itheima.d2_modifier;

public class Test {
    public static void main(String[] args) {
        // 权限修饰符的修饰范围
        Fu f = new Fu();
        // 唯独不支持 private
        f.method();
        f.protectedMethod();
        f.publicMethod();

    }
}
