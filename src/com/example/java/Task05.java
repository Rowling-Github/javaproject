package com.example.java;       //猜数字游戏
import java.util.Random;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber= random.nextInt(10);
        System.out.println(randomNumber);//打印生成的随机数
        Scanner sc=new Scanner(System.in);  //构建键盘输入流
        System.out.println("请输入你猜的数字：\n");
        int scannerNumber= sc.nextInt();    //键盘获取整数
        while (scannerNumber!=randomNumber){
            if(scannerNumber>randomNumber){
                System.err.println("猜大了");
            }
            else{
                System.err.println("猜小了");
            }
            System.out.println("请重新输入");
            scannerNumber=sc.nextInt();     //重新从键盘获取数字
        }
        System.out.println("恭喜你猜对了");
    }
}
