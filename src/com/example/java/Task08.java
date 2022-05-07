package com.example.java;   //剪刀石头布
import java.util.Random;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        System.out.println("剪刀  石头  布");
        System.out.println(" 1     2    3");
        Random random = new Random();   //构造随机数
        Scanner sc=new Scanner(System.in);      //构建输入流
        int computerWin=0,userWin=0;        //用户和电脑赢的次数 赋初值为0
        for (int i=1;i<=5;i++){         //循坏次数
            int randomNumber=random.nextInt(3)+1;       //构建范围为1-3的随机数
            System.out.println("请输入你的数：");
            int inputNumber = sc.nextInt();             //输入值
            System.out.println("电脑输入的随机数为："+randomNumber);
            System.out.println("你输入的随机数为："+inputNumber);
            if (inputNumber>0 && inputNumber<4){
                if (inputNumber==randomNumber){
                    System.out.println("第"+i+"局的结果为 ：平局");
                }
                else if (randomNumber==1 && inputNumber==2){
                    System.out.println("第"+i+"局的结果为 ：用户赢");
                    userWin++;
                }
                else if (randomNumber==2 && inputNumber==1){
                    System.out.println("第"+i+"局的结果为 ：电脑赢");
                    computerWin++;
                }
                else if (randomNumber==3 && inputNumber==2){
                    System.out.println("第"+i+"局的结果为 ：电脑赢");
                    computerWin++;
                }
                else if (randomNumber == 2){
                    System.out.println("第"+i+"局的结果为 ：用户赢");
                    userWin++;
                }
                else if (randomNumber==1 && inputNumber==3){
                    System.out.println("第"+i+"局的结果为 ：电脑赢");
                    computerWin++;
                }
                else if (randomNumber == 3){
                    System.out.println("第"+i+"局的结果为 ：用户赢");
                    userWin++;
                }
            }
            else {
                System.err.println("用户数据输入错误，只能输入1-3的数");
            }
        }
        System.out.println("电脑共计赢的次数为 ："+computerWin);
        System.out.println("用户共计赢的次数为 ："+userWin);
        if (computerWin>userWin){
            System.out.println("最终结果为 ：电脑赢");
        }
        else if (computerWin<userWin){
            System.out.println("最终结果为 ：用户赢");
        }
        else {
            System.out.println("最终结果为 ：平局");
        }
    }
}
