package com.homework.java.viewachievement;

import java.util.Scanner;
/**
 * @author maibangbangtangsongdemacbookpro
 * version 1.0
 */
public class Student {
    private int sNO; //定义学号
    private String sName;   //定义学生姓名
    private String sSex;    //定义学生性别
    private int sAge;    //定义学生年龄
    private double sJava;   //定义学生课程成绩

    public int getNO() {
        return sNO;
    }
    public void setNO(int sNO) {
        this.sNO = sNO;
    }
    public String getName() {
        return sName;
    }
    public void setName(String sName) {
        this.sName = sName;
    }
    public String getSex() {
        return sSex;
    }
    public void setSex(String sSex) {
        this.sSex = sSex;
    }
    public int getAge() {
        return sAge;
    }
    public void setAge(int sAge) {
        this.sAge = sAge;
    }
    public double getJava() {
        return sJava;
    }
    public void setJava(double sJava) {
        this.sJava = sJava;
    }

    public Student() {  //无参构造器
    }
    public Student(int sNO, String sNane, String sSex, int sAge, double sJava) {   //定义有参构造方法
        this.sNO = sNO;
        this.sName = sNane;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }
    public void read (){   //打印
        System.out.println("姓名："+getName()+"\t性别："+getSex()+"\t年龄："+getAge()+"\t课程成绩:"+getJava());
    }
    public void printMaxMin(double[] javaScores){   //获取数组最大最小值
        double Max=javaScores[0], Min=javaScores[0];
        for (int i=1;i<javaScores.length;i++){
            if (Max<javaScores[i])
                Max=javaScores[i];
            if (Min>javaScores[i])
                Min=javaScores[i];
        }
        System.out.println("java语言成绩的最高分为："+Max);
        System.out.println("java语言成绩的最低分为："+Min);
//        Arrays.sort(javaScores);
//       Max=javaScores[javaScores.length];
//       Min=javaScores[0];
    }

    public  void inputJavaScore(double[] javaScores){   //分别输入Java成绩并求平均值
        Scanner scanner=new Scanner(System.in);
        System.out.println("提示：请分别输入刘叼毛、小王、王二小、张三、王二这五个学生的成绩");
        System.out.println("=========================");
        double sum=0;
        for (int i=0;i<javaScores.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            javaScores[i]=scanner.nextDouble() ;
            sum+=javaScores[i];
        }
        System.out.println("Java语言的平均成绩为："+sum/javaScores.length);
    }
    public static void main(String[] args) {
        double[] javaScores = new double[5];//定义一个数组用于存入五个学生的Java成绩
        Student std=new Student();//实例化对象
        std.inputJavaScore(javaScores);//调用输入Java成绩并求平均值方法
        std.printMaxMin(javaScores);    //调用求最大最小值方法
        Student std1=new Student(20212911,"刘叼毛","女",17,javaScores[0]);  //实例化对象
        Student std2=new Student(20212932,"小王","男",18,javaScores[1]);
        Student std3=new Student(20212945,"王二小","男",20,javaScores[2]);
        Student std4=new Student(20212933,"张珊","女",19,javaScores[3]);
        Student std5=new Student(20212922,"王二","男",18,javaScores[4]);
        std1.read();
        std2.read();
        std3.read();    //调用读取方法
        std4.read();
        std5.read();
    }
}
