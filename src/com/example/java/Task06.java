package com.example.java;
//超市购物
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        System.out.println("编号\t商品名称\t价格\t");       //打印列表
        System.out.println("1\t牙刷\t    8.8元\t");
        System.out.println("2\t毛巾\t    10.0元\t");
        System.out.println("3\t水杯\t    18.8元\t");
        System.out.println("4\t苹果\t    12.5元\t");
        System.out.println("5\t香蕉\t    15.5元\t");
        double toothBrush = 8.8;
        double towel = 10.0;
        double cup = 18.8;
        double apple = 12.5;
        double banana = 15.5;
        double totalPrice = 0x0;        //第一次总价
        double allTotalprice=0;         //最后一次总价
        boolean loop=true;          //定义布尔值
        while (loop){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你想要购买的商品编号:");
            int scannerCode = sc.nextInt();  //键盘键入
            System.out.println("请输入购买数量:");
            double scannerNumber = sc.nextDouble();
            switch (scannerCode){       //商品编号
                case 1:
                    totalPrice = scannerNumber * toothBrush;        //总价=数量*单价
                    break;
                case 2:
                    totalPrice = scannerNumber * towel;
                    break;
                case 3:
                    totalPrice = scannerNumber * cup;
                    break;
                case 4:
                    totalPrice = scannerNumber * apple;
                    break;
                case 5:
                    totalPrice = scannerNumber * banana;
                    break;
                default:
                    System.out.println("没有此类商品");
            }
            System.out.println("本次购物总共话费：" + totalPrice + "元");
            System.out.println("本次购物已完成，是否继续购物?Y : N");
//            sc = new Scanner(System.in);
            char ch=sc.next().charAt(0);        //定义字符型变量并取首字符
             if(ch=='N'){
                 loop=false;                //值为假   跳出循环    程序结束
//                 System.out.println("程序结束");
             }
             allTotalprice+=totalPrice;         //再次购买的总价
        }
        System.out.println("再次购买的价格为："+allTotalprice);      //输出再次购买后的总价
    }
}