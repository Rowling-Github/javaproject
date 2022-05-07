package com.homework.java.usb;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.add(new KeyBorad());
        computer.add(new Mouse());
        computer.add(new Mike());
        int key;
       for (int i=0;i<2;i++){
            System.out.println("提示：1.启动\t2.关机");
            Scanner scanner = new Scanner(System.in);
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    computer.powerOn();  //调用启动
                    break;
                case 2:
                    Test.delay();    //调用延迟方法
                    computer.powerOff(); //调用关闭
                    break;
            }
       }
    }
    public static void delay(){ //延迟方法
        for (int i=10;i>0;i--)
        {
            System.out.println("计算机即将在"+i+"秒后关闭......");
            try {
                Thread.sleep(1000); //进行延迟时间
            }
            catch (InterruptedException e) {  //异常处理机制，对异常进行捕获
                e.getMessage();
            }
        }
    }
}
