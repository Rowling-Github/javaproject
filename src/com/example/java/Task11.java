package com.example.java;
//BUG_数组存入错误 eg.存三个数实际上只有两个数  BUG2_多次注册只能匹配到一个账号登陆
import java.util.Scanner;
public class Task11 {
    public  void UserLogin(int uid,String[][]userInformation){  //登陆
        Scanner scanner = new Scanner(System.in);                   //构建输入流
        do{
            System.out.println("请输入你的用户名：");
            String userName= scanner.next();
            System.out.println("请输入你的登陆密码：");
            String userPassword= scanner.next();
            for(int i=0;i<=uid;i++) {
                    if ((userName.equals(userInformation[i][0])) & (userPassword.equals(userInformation[i][1]) )) {
                            System.out.println("登陆成功！");
                            System.out.println("--------------------------");
                    break;
                }
                    else {
                    System.out.println("没有该账户");
                    System.out.println("是否继续登陆？y/n");
                    String str = scanner.next();
                         if (str.equals("n")) {
                             System.out.println("程序结束");
                             break;
                         }
                }
                    break;
            }
            break;
        }while (true);
    }
    public void Registration(int uid,String[][]userInformation){     //注册
        Scanner sc=new Scanner(System.in);  //构建输入流
        do {
            System.out.println("请设置您的用户名：");
            userInformation[uid][0]=sc.next();  //输入内容放入数组
            System.out.println("请设置你的密码：");
            String newPassword1=sc.next();
            System.out.println("请再次输入你的密码：");
            String newPassword2=sc.next();
            if (newPassword1.equals(newPassword2)){    //确认两次密码是否相同
                userInformation[uid][1]=newPassword2;
                System.out.println("注册成功！");
                uid++;
            }
        else System.out.println("两次输入密码不一致");
            System.out.println("是否继续注册？y:n");
            String str = sc.next();
            if (str.equals("n")) {
                System.out.println("程序结束");
                break;
            }
        }while (true);
    }
    public  void printUsername(int uid,String[][]userInformation){      //打印
        for (int i=0;i<=uid;i++) {
            System.out.println("| 第" + (i+1) + "个用户的账号是：" + userInformation[i][0] + " 密码是：" + userInformation[i][1]);
        }
    }
    public static void main(String[] args) {    //主方法
        String[][] userInformation = new String[100][2];
        Task11 Ta=new Task11();
        int uid=0;
        int choice = 0;
        do {
            System.out.println("操作提示：");
            System.out.println("1   -- 登录");
            System.out.println("2   -- 注册");
            System.out.println("3   -- 查看所有的用户名与密码");
            System.out.println("4   -- 退出系统");
            System.out.print("请输入操作码（1-4）：");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Ta.UserLogin(uid,userInformation);   //调用登陆
                    break;
                case 2:
                    Ta.Registration(uid, userInformation);    //调用注册
                    uid=uid+1;
                    break;
                case 3:
                    Ta.printUsername(uid, userInformation);     //调用打印
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入错误");
            }
        }while (true);
    }

}
