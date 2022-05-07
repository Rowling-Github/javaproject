package com.example.java;

public class Dog extends Animal {
    String name="gou";
    public void shout(){
        super.shout();
        System.out.println("汪汪汪！！");
    }
    public void printName() {
        System.out.println("名字:" + super.name);
    }
}
