package com.gzq.behavioral.chain;

/**
 * 1.链条的引用点
 * 2.下一个继续
 * 3.构造链条
 * 回旋责任链
 * Filter:1--2--3--本人--3--2--1
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher gzq = new Teacher("gzq");
        Teacher gzq1 = new Teacher("gzq1");
        Teacher gzq2 = new Teacher("gzq2");
        //3.构造链条
        gzq.setNext(gzq1);
        gzq1.setNext(gzq2);

        gzq.handleRequest();

    }
}
