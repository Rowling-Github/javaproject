package com.example.java;

import java.util.Scanner;
@SuppressWarnings({"all"})
class  Student{
    private  String name;
    private  int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<=0){
            System.out.println("你输入的年龄有误！");
        }else {
            this.age = age;
        }
    }
    public  void read(){
        System.out.println("大家好！我是"+name+"\n我今年"+age+"岁了！");
    }
}
public class Example04 {
    public static void main(String[] args) {    //主方法
        Student str=new Student();  //实例化对象
        Scanner sc=new Scanner(System.in);//构建输入流
        System.out.println("请输入你的名字：");
        String userName=sc.nextLine();
        System.out.println("请输入你的年龄：");
        int userAge=sc.nextInt();
        str.setAge(userAge);    //赋值
        str.setName(userName);
        str.read();
        System.out.println(str.getAge());
    }
}
