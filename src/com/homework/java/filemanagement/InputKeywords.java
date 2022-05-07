package com.homework.java.filemanagement;

import java.io.File;
import java.util.Scanner;

public class InputKeywords {
    public void inputKeywords(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入需要检索的文件目录和关键字：");
        String content= scanner.next();
        File file=new File(content);
        if (file.exists()){
            System.out.println(file.getPath());
        }
    }
}
