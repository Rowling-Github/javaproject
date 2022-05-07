package com.homework.java.usb;

public class Mouse implements USB {

    @Override
    public void turnOn() {
        System.out.println("鼠标已启用");

    }

    @Override
    public void turnOff() {
        System.out.println("鼠标已停用！！");

    }
}

