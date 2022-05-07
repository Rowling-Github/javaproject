package com.homework.java.filemanagement;

import java.util.Scanner;

public class FileManagement {
    public static void main(String[] args) throws Exception {
        InputKeywords inputKeywords=new InputKeywords();
        DeleteFile deleteFile=new DeleteFile();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户指令：\n1.指定关键字检索文件\n2.指定后缀名检索文件\n3.删除文件/目录\n4.退出系统");
            int key = scanner.nextInt();
            switch (key) {
                case 1:inputKeywords.inputKeywords(); //指定关键字检索文件
                    break;
                case 2: //指定后缀名检索文件
                    break;
                case 3:deleteFile.delete();//删除文件/目录
                    break;
                case 4:System.exit(0); //退出系统

                default:
                    System.err.println("输入错误，请重新输入：");
            }
        }
    }
}
