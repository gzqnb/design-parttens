package com.gzq.structural.proxy.cglib;

//需要导入cglib依赖
public class CglibTest {
    public static void main(String[] args) {
        GuoTikTok guoTikTok = new GuoTikTok();
        GuoTikTok proxy = CglibProxy.createProxy(guoTikTok);
        proxy.tikTokToHaha();
    }
}
