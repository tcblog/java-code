package com.itheima.branch;

public class SwitchDemo1 {
    public static void main(String[] args) {
        String weekday = "周三";
        switch (weekday){
            case "周一":
                System.out.println("1");
                break;
            case  "周二":
                System.out.println("2");
                break;
            case "周三":
                System.out.println("3");
                break;
            case "周四":
                System.out.println("4");
                break;
            case "周五":
                System.out.println("5");
                break;
            default:
                System.out.println("数据有误！");
        }

    }
}
