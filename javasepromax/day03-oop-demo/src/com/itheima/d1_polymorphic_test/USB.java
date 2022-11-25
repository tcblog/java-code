package com.itheima.d1_polymorphic_test;

/**
 * usb 接口 = 规范
 */
public interface USB {
    // 接入和拔出
    void connect();
    void unconnect();
}
