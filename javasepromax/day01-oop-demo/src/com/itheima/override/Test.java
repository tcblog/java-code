package com.itheima.override;

public class Test {
    public static void main(String[] args) {
        // 认识方法重写
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMsg();
    }
}

class NewPhone extends Phone{

    // 声明是一样的，重写的方法
    @Override   // 重写校验注解，加上之后，这个方法必须是正确重写的（方法名一样），才安全
                // 提高程序可读性，只要加上了这个东西，别人就知道这是重写的方法
    public  void call(){
        // 调用父类的方法
        super.call();
        System.out.println("开始视频通话");

    }

    // 重写的方法
    public  void sendMsg(){
        // 先调父类的sendMsg
        super.sendMsg();
        System.out.println("发送有趣的图片");
    }
}


class Phone{
    public  void call(){
        System.out.println("打电话");

    }

    public  void sendMsg(){
        System.out.println("发短信");
    }
}
