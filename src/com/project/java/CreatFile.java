package com.project.java;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) throws IOException {
        File file=new File("test.txt");
        if (file.exists()){
            System.out.println("youwenjian");
            System.out.println(file);
        }
        else System.out.println(file.createNewFile());
    }

}
