package com.project.java;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example11 {
    public static void main(String[] args) throws Exception{
        OutputStream out=new FileOutputStream("example11.txt",true);//创建一个文件字节输入流
        String str="成都欢迎你";
        byte [] b=str.getBytes();
        for (int i=0;i< b.length;i++){
            out.write(b[i]);
        }
        out.close();
    }
}
