package com.gzq.structural.proxy.dynamic;


import java.util.Arrays;

//动态代理模式
//JDK要求被代理对象必须有接口
//代理对象和目标对象的相同点在于都是同一个接口
public class MainTest {
    public static void main(String[] args) {
        ManTikTok guoTikTok = new GuoTikTok();
//        new xxx
        //动态代理机制
        ManTikTok proxy = JdkTiktokProxy.getProxy(guoTikTok);
        proxy.tikTok();
        ((SellTiktok)proxy).sell();
        //能不能代理被代理对象本类自己的方法 会报错 proxy只能转成接口类
//        ((GuoTikTok)proxy).haha();
        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
    }
}
