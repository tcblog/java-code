package com.itheima.d1_polymorphic_test;

public class Mouse implements USB{
    private String name;


    public Mouse(String name) {
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
        System.out.println(name + "连接");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "拔出");
    }

    /**
     * 独有功能
     */
    public void dbClick(){
        System.out.println(name + "一键三连");
    }
}
