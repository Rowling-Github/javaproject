package com.example.java;
import sun.lwawt.macosx.CSystemTray;
import java.util.Scanner;
//登录注册
public class Task10 {
    public static void main(String[] args) {
        int number=0; //初始化
        System.out.println("你是登陆还是注册？\n1.登陆\n2.注册\n3.退出");
//        构建键盘输入流
        Scanner scanner = new Scanner(System.in);
        while (number!=1 && number!=2) {
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("请输入账号：");
                int admin = scanner.nextInt();         //登陆
                System.out.println("请输入密码：");
                int password = scanner.nextInt();
                if (admin == 20212911 && password == 666666)
                    System.out.println("登陆成功！");
            } else if (number == 2) {
                System.out.println("请输入用户名：");//注册_登陆
                String newAdmin = scanner.nextLine();
                System.out.println("请设置您的密码：");
                String newPassword = scanner.nextLine();
                System.out.println("注册成功！");
                System.out.println("正在跳转登陆页面loading……");
            } else{
                System.err.println("输入错误，请重新输入");
            }
        }
    }
}
