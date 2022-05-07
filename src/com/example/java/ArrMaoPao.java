package com.example.java;
//冒泡练习_排序_从小到大
public class ArrMaoPao {
    public static void main(String[] args) {
        int[]arr={2,100,77,56,43};
        System.out.println("冒泡前");
        PrintArray(arr);//调用方法遍历打印，冒泡前
        System.out.println("====================");
        MaoPao(arr);
        System.out.println("冒泡后");
        PrintArray(arr);//调用方法遍历打印，冒泡后
    }
    public static void PrintArray(int[] arr){   //打印方法，遍历
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public  static void MaoPao(int[] arr){      //冒泡方法
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
