package com.homework.java.usb;

public class KeyBorad implements USB {  //implements实现

    @Override
    public void turnOn() {
        System.out.println("键盘已启动");

    }

    @Override
    public void turnOff() {
        System.out.println("键盘已停用！！");

    }
}
