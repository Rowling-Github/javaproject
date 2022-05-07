package com.homework.java.LoginRegistration;
import java.util.Scanner;
public class LoginRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//构建输入流
        int uid = 0;
        String[][] userInformation = new String[20][2];
        while (true){
            System.out.println("操作指南：");
            System.out.println("1.登陆\n2.注册\n3.退出\n4.查看所有账户信息");
            System.out.println("请输入：");
            LoginRegistration ms = new LoginRegistration();
            int value = sc.nextInt();
            switch (value) {
                case 1:
                    ms.Login(uid, userInformation);
                    break;
                case 2:
                    ms.Registration(uid, userInformation);
                    uid+=1;
                    break;
                case 3:
                    break;
                case 4:
                    ms.printRegistration(uid, userInformation);
                    break;
                default:
                    System.out.println("输入错误，请重新输入：");
            }
        }
    }
    public void Login(int uid,String[][]userInformation) {    //登陆
        System.out.println("请输入你的用户名：");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("请输入你的用户密码：");
        String userPassword = sc.nextLine();
        if (userName.equals(userInformation[uid][0]) && userPassword.equals(userInformation[uid][1]))
            System.out.println("登陆成功！");
        else {
            System.out.println("登陆失败");

        }
    }

    public void Registration(int uid, String[][] userInformation) {      //注册
        Scanner sc = new Scanner(System.in);

            System.out.println("请设置用户名：");
            userInformation[uid][0] = sc.nextLine();
            System.out.println("请设置登陆密码：");
            String password1 = sc.nextLine();
            System.out.print("请再次输入密码");
            String password2 = sc.nextLine();
            if (password1.equals(password2)) {
                System.out.println("注册成功！");
                userInformation[uid][1] = password2;
//                System.out.println("是否继续注册？");
            }

    }
    public void printRegistration(int uid,String[][]userInformation){
        for(int i=0;i<uid;i++) {
            System.out.println("第"+(i+1)+"个用户账号是"+userInformation[i][0]);
            System.out.println("第"+(i+1)+"个用户密码是"+userInformation[i][1]);

        }
    }

}