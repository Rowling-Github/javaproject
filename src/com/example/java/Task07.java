package com.example.java;
//为新员工分配部门
import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        int personNumber=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入面试人数：");
        personNumber= sc.nextInt();
        for (int i = 1; i <= personNumber; i++) {
            System.out.print("请输入姓名：");
            String name = sc.next();
            System.out.print("请输入应聘语言：");
            String programLanguage = sc.next();
            switch (programLanguage) {
                case "Java":
                    System.out.println("java程序开发部门");
                    break;
                case "C#":
                    System.out.println("C#程序开发部门");
                    break;
                case "asp.net":
                    System.out.println("asp.net程序测试部门");
                    break;
                case "html":
                    System.out.println("前端程序开发部门");
                    break;
                default:
                    System.out.println("抱歉，我们公司没有适合你的岗位");
            }
        }
    }
}