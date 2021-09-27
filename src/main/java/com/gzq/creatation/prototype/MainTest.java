package com.gzq.creatation.prototype;

/**
 * 是用于创建重复的对象，同时又能保证性能
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        GzqMybatis gzqMybatis = new GzqMybatis();
        //得到的是克隆体
        User gzq1 = gzqMybatis.getUser("gzq1");
        System.out.println(gzq1);
        gzq1.setName("gzq2");
        System.out.println("gzq2自己改了"+gzq1);
        User gzq11 = gzqMybatis.getUser("gzq1");
        User gzq12 = gzqMybatis.getUser("gzq1");
        System.out.println(gzq1);
        System.out.println(gzq11);
        System.out.println(gzq12);
    }
}
