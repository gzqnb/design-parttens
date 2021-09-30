package com.gzq.structural.proxy.dynamic;


//主体
public class GuoTikTok implements ManTikTok,SellTiktok {
    @Override
    public void tikTok() {
        System.out.println("gzq直播tiktok");
    }

    @Override
    public void sell() {
        System.out.println("只要666");
    }

    public void haha(){
        System.out.println("hhhhhhhh");
    }
}
