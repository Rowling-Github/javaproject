package com.homework.java.viewconfiguration;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Function function1=new Function("自动拨号","玩游戏","播放音乐");
        Function function2=new Function("自动拨号","玩游戏","播放音乐");
        Configure configure1=new Configure("小米10XPro","5G","安卓OS",1999.0,"256G");
        Configure configure2=new Configure("华为P50Pro","4G","鸿蒙OS",5999.0,"128G");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要查看的手机品牌：");
        String phoneConfig=scanner.nextLine();
        if (phoneConfig.equals("小米")){
           configure1.read();
           function1.read();
        }
        else if (phoneConfig.equals("华为")){
            configure2.read();
            function2.read();
        }
        else System.out.println("没有此品牌的手机");
    }
}