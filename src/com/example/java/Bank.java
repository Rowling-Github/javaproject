package com.example.java;

import java.util.Scanner;

//set()是给属性赋值的，get()是取得属性值的
public class Bank {
    private  String account;
    private  Double money;
    public String getAccount() {    //获取访问权限
        return account;
    }
    public Double getMoney() {
        return money;
    }
    public void saveMoney(){    //存钱
        this.money=this.money+money;
        System.out.println("请输入你存入的金额：");
        Scanner sc=new Scanner(System.in);
        money= sc.nextDouble();
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setMoney(Double money) {
        this.money = money;

    }
    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                ", money=" + money +
                '}';
    }
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.setAccount("123456");
        bank.setMoney(500.0);
        System.out.println(bank);
        bank.saveMoney();
        System.out.println(bank);
    }

}
