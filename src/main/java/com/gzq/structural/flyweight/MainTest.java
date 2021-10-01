package com.gzq.structural.flyweight;

public class MainTest {
    public static void main(String[] args) {
        //1.xxx1
        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("");
        waitress.service();
        System.out.println(waitress);
        //2.xxx2
        AbstractWaitressFlyweight waitress1 = ZuDao.getWaitress("");
        waitress1.service();
        System.out.println(waitress1);
        waitress1.end();
        //3.xxx3
        AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("");
        waitress2.service();
        System.out.println(waitress2);
    }
}
