package com.homework.java.filemanagement;

import java.io.File;
import java.util.Scanner;

public class InputSuffix {
    public void inputSuffix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除的文件目录：");
        String content = scanner.next();
        File file = new File(content);
        if (file.exists()) {
            System.out.println(file.delete());
        }
    }
}
