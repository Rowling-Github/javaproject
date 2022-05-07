package com.example.java;
import java.util.Scanner;
@SuppressWarnings({"all"})
/**
 * @author Rowling.
 * version 1.0
 * 输入某年某月某日，判断这一天是这一年的第几天?
 */
public class JudgmentDate {
    private int year;
    private int month;
    private int day;
    public int getYear() {
        return year;
    }
    public void setYear() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份：");
        year=scanner.nextInt();
        if (year<1){
            System.err.println("警告⚠️ ：输入错误！！");
            System.exit(0); //退出系统
        }else
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份：");
        month=scanner.nextInt();
        if (month<1 || month>12){
            System.err.println("警告⚠️ ：输入错误！！");
            System.exit(0); //退出系统
        }
        else
            this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入日期：");
        day=scanner.nextInt();
        if (day<1 || day>31){
            System.err.println("警告⚠️ ：输入错误！！");
            System.exit(0); //退出系统
        }else
        this.day = day;
    }
    public static void main(String[] args) {
        int [] month= new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//将平年每月天数分别存入
        JudgmentDate judgmentDate=new JudgmentDate();
       judgmentDate.setYear();
       judgmentDate.setMonth(); //调用三个输入方法
       judgmentDate.setDay();
        if((judgmentDate.getYear()%400==0)||(judgmentDate.getYear()%4==0)&&(judgmentDate.getYear()%100!=0)) {//判断是否为闰年并统计为闰年时总天数
            for (int i=0;i<judgmentDate.month;i++){
                judgmentDate.day+=month[i];
            }
            System.out.println("这是"+judgmentDate.getYear()+"年的第"+(judgmentDate.getDay()+1)+"天");//此处因为闰年2月是29天，又原数组存的为平年的天数，所以加上一天
        }
        else {//统计为平年时总天数
            if (judgmentDate.getMonth()==2 && judgmentDate.getDay()>28){
                System.err.println("警告⚠️ ："+judgmentDate.getYear()+"年2月没有"+judgmentDate.getDay()+"号！！！");
                System.exit(0); //退出系统
            }
            for (int i=0;i<judgmentDate.month;i++){
                judgmentDate.day+=month[i];
            }
            System.out.println("这是"+judgmentDate.getYear()+"年的第"+judgmentDate.getDay()+"天");
        }
    }
}
