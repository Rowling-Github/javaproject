package com.example.java;
//小明都可以买什么
public class Task02 {
    public static void main(String[] args) {
        int dollar=20,bookPrice=12;
        int qianBi=1,xiangPi=2,keLe=3,lingShi=5;
        int shenPrice=dollar-bookPrice;
        System.out.println("可以买的铅笔数为："+shenPrice/qianBi);
        System.out.println("可以买的橡皮数为："+shenPrice/xiangPi);
        System.out.println("可以买的可乐数为："+shenPrice/keLe);
        System.out.println("可以买的零食数为："+shenPrice/lingShi);
    }
}
