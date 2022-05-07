package com.homework.java.LoginRegistration;

import java.util.Objects;
import java.util.Scanner;

public class LogRegister {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LogRegister ms = new LogRegister();

        String[][] userInformation = new String[100][2];

        int uid = 0;

        do {
            System.out.println("操作提示：");
            System.out.println("1   -- 登录");
            System.out.println("2   -- 注册");
            System.out.println("3   -- 查看所有的用户名与密码");
            System.out.println("4   -- 退出系统");
            System.out.print("请输入操作码（1-4）：");
            int choose = in.nextInt();
            switch (choose) {
                case 1:
                    ms.UserLogin(uid, userInformation);
                    break;
                case 2:
                    ms.register(uid, userInformation);
                    uid = uid + 1;
                    break;
                case 3:
                    ms.printUserInformation(uid, userInformation);
                    break;
                case 4:
                    System.out.println("退出了系统");
                    return;
                default:
                    System.err.println("输入错误，请重新输入！");
                    break;
            }
        } while (true);
    }

    public void register(int uid, String[][] userInformation) { //
        Scanner in = new Scanner(System.in);
        System.out.println("-----创建用户-----");
        System.out.print("| 注册用户名：");
        userInformation[uid][0] = in.nextLine();
        do {
            System.out.print("| 输入密码：");
            String password1 = in.nextLine();
            System.out.print("| 确认密码：");
            String password2 = in.nextLine();
            if (Objects.equals(password1, password2)) {
                System.out.println("| 注册成功！！");
                System.out.println("----------------");
                userInformation[uid][1] = password1;
                return;
            } else {
                System.out.println("| 两次密码不一致！！\n");
            }
        } while (true);
    }
    public void printUserInformation(int uid, String[][] userInformation) {
        System.out.println("-----用户信息-----");
        for (int i = 0; i < uid; i++) {
            System.out.println("| 第" + (i+1) + "个用户的账号是：" + userInformation[i][0] + " 密码是：" + userInformation[i][1]);
        }           //优化uid——（i+1）
        System.out.println("----------------");
    }
    public void UserLogin(int uid, String[][] userInformation) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("| 输入用户名：");
            String username = in.nextLine();
            System.out.print("| 输入密码：");
            String password = in.nextLine();
            for (int i = 0; i < uid; i++) {
                if (Objects.equals(userInformation[i][0], username) & Objects.equals(userInformation[i][1], password)) {
                    System.out.println("| 登录成功！！");
                    System.out.println("----------------");
                    return;
                }
            }
            System.out.println("| 用户名或者密码错误！！");
        } while (true);
    }
}
