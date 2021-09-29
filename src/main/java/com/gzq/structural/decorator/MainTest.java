package com.gzq.structural.decorator;

public class MainTest {
    public static void main(String[] args) {
//        被装饰对象
        GuoTikTok guoTikTok = new GuoTikTok();
//        guoTikTok.tikTok();
        MeiYanDecorator decorator = new MeiYanDecorator(guoTikTok);
        decorator.tikTok();

    }
}
