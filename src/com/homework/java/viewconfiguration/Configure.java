package com.homework.java.viewconfiguration;

public class Configure {    //配置类
    private String brand;   //定义品牌
    private String model;   //定义型号
    private String operatingSystem; //操作系统
    private Double price;   //价格
    private  String RAM;    //内存
    public Configure(){}
    public Configure(String brand, String model, String operatingSystem, Double price, String RAM) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.RAM = RAM;
//        生成相应的构造方法
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    public void read(){ //打印方法
        System.out.println("配置："+brand+"\t "+model+" \t"+operatingSystem+"\t "+price+"\t "+RAM);
    }
}


