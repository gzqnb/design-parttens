package com.gzq.structural.proxy.statics;

//代理一般都是和被代理对象属于同一个接口
public class TiktokProxy implements ManTikTok{

    private ManTikTok manTikTok;//被代理对象
    public TiktokProxy(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    @Override
    public void tikTok() {
        //增强功能
        System.out.println("渲染直播");
        manTikTok.tikTok();

    }
}
