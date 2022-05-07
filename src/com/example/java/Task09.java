package com.example.java;
//抽取幸运观众
import java.util.Random;
import java.util.Scanner;
public class Task09 {
    //    存储观众姓名
    public void addPlayerName(String[] names){
        Scanner in= new Scanner(System.in);
        for(int i=0;i<names.length;i++){
            System.out.print("输入第"+(i+1)+"个观众的姓名：");
            names[i] = in.nextLine();//存储名字
        }
    }

    //    遍历打印
    public void printPlayerNames(String[] names){
        for(int i=0;i<names.length;i++){
            System.out.println("第"+(i+1)+"个观众姓名是："+names[i]);
        }
        System.out.println();
    }

    //    随机抽取幸运观众
    public String randomPlayerName(String[] names){
        Random  r=new Random();
        return names[r.nextInt(names.length)];
    }
    public static void main(String[] args) {
        String[] playerNames=new String[3];
        Task09 task09 = new Task09();
        task09.addPlayerName(playerNames);
        task09.printPlayerNames(playerNames);
        String randomName=task09.randomPlayerName(playerNames);
        System.out.print("随机的观众是：");
        System.out.println(randomName);
    }
}