package com.gzq.structural.decorator;

//美颜装饰器
//装饰谁
//装饰器之关系增强这个类的方法，连接了两个东西的叫适配器，装饰器和适配器很像，
//唯一区别就是一个之关系了要被增强对类，一个是关系了两个类
public class MeiYanDecorator implements TikTokDecorator {
    private ManTikTok manTikTok;

    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tikTok() {
        //开启美颜
        enableMeiYan();
        //开始直播
        manTikTok.tikTok();
    }

    //定义的增强功能
    @Override
    public void enableMeiYan() {
        System.out.println("帅！鲜花");
        System.out.println("帅！鲜花");
        System.out.println("帅！鲜花");
        System.out.println("帅！鲜花");
        System.out.println("帅！鲜花");
    }
}
