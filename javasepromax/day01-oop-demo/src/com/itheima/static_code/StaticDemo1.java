package com.itheima.static_code;

public class StaticDemo1 {

    public static String shcoolName;

    /**
     * 静态代码块：有static修饰，属于类，与类（在main加载的前面）一起优先加载一次，自动触发
     * 作用：可以用于初始化静态资源
     */
    static {
        System.out.println("静态方法执行了");
        // 可以在此次进行初始化
        shcoolName = "黑马";
    }

    public static void main(String[] args) {
        System.out.println("man执行了");
        System.out.println(shcoolName);
    }
}
