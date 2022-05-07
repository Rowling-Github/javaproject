package com.example.java.chapter05;

public class Example01 {
    public static void main(String[] args) throws Exception {
        String str1=new String();
        String str2=new String("abcd");
        char[]charArray=new char[] {'D','E','F'};
        String str3=new String(charArray);
        byte[] arr={97,98,99};
        String str4=new String(arr);
        System.out.println(str2);
        System.out.println(charArray);
        System.out.println(str4);

    }
}
