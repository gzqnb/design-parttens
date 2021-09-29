package com.gzq.creatation.builder;

public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaoMiBuilder();
        //建造这个手机
//        builder.customMem("16G");
//        builder.customDisk("512G");
//        builder.customCpu("骁龙888");
//        builder.customCam("一亿像素");

        //链式建造者
        Phone product = builder.customCam("一亿像素")
                .customDisk("512G")
                .customMem("16G")
                .customCpu("骁龙888")
                .getProduct();

        System.out.println(product);
    }
}
