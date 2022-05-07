package com.example.java;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        String huaweiBrand="华为P50",xiaomiBrand="小米 ";    //品牌型号
        double huaweiSize=5.5,xiaomiSize=4.5;      //尺寸
        float huaweiPrice=8000f,xiaomiPrice=1999f;    //价格
        String huaweiConfig="处理器：骁龙888_4G       |操作系统:HarmonyOS 2 |储存: 运行内存+机身内存8GB RAM+128/256GB ROM \n",xiaomiConfig="处理器：高通骁龙888_5G    |操作系统：安卓OS      |储存：运行内存+机身内存8GB RAM+128/256GB ROM ";      //配置
        int huaweiCount=800;        //库存
        double huaweiTotal ,xiaomiTotal;     //总价
        System.out.println("请输入华为手机的库存数量：");
        Scanner s=new Scanner(System.in);           //键入值
        int i=s.nextInt();
        System.out.println("请输入小米手机的库存数量：");
        int i1=s.nextInt();
        huaweiTotal=i*huaweiPrice;
        xiaomiTotal=i1*xiaomiPrice;
        System.out.println("【品牌型号】:"+huaweiBrand+"  |   "+xiaomiBrand);
        System.out.println("--------------------------------------------------------");
        System.out.println("【尺寸】："+huaweiSize+"寸"+"      ｜  "+xiaomiSize+"寸");
        System.out.println("--------------------------------------------------------");
        System.out.println("【价格】："+huaweiPrice+"     | "+xiaomiPrice);
        System.out.println("--------------------------------------------------------");
        System.out.println("        "+huaweiConfig+"【配置】: \n" +"        "+xiaomiConfig);
        System.out.println("--------------------------------------------------------");
        System.out.println("【库存总量】："+(i+i1));//"+"表示连接左边的字符串
        System.out.println("--------------------------------------------------------");
        System.out.println("【总价】："+(huaweiTotal+xiaomiTotal));
        System.out.println("--------------------------------------------------------");
    }
}
