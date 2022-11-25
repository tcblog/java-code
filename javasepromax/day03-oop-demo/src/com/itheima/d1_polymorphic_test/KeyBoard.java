package com.itheima.d1_polymorphic_test;

/**
 * 实现类
 */
public class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "插入");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "拔出");
    }

    /**
     * 独有功能
     */
    public void keyDown(){
        System.out.println(name + "键盘敲击了");
    }
}
