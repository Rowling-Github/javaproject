package com.homework.java.usb;

public class Mike implements USB {

    @Override
    public void turnOn() {
        System.out.println("麦克风已开启");

    }

    @Override
    public void turnOff() {
        System.out.println("麦克风已停用！！");

    }
}

