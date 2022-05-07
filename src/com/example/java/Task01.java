package com.example.java;
//判断奇偶数
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个数：");
        number=s.nextInt();
        if (number%2==0 && number!=0){
            System.out.println(number+"是偶数");
        }
        else if (number==0){
            System.out.println(number+"既不是奇数也不是偶数");
        }
        else {
            System.out.println(number+"是奇数");
        }
    }
}
