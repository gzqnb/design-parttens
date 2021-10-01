package com.gzq.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MMTikToker extends AbstractTikToker{
    //观察者的核心！！！！！！！！
    List<AbstractFans> fansList = new ArrayList<>();
    void startSell(){
        System.out.println("开始卖货");
        notifyFans("开始卖东西了");
    }

    void endSell(){
        System.out.println("gzq结束卖货");
        notifyFans("课已满完");
    }

    @Override
    void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    @Override
    void notifyFans(String msg) {
        for (AbstractFans fans : fansList) {
            //所有粉丝拿来通知！！！！！！！！！！
            fans.acceptMsg(msg);
        }
    }
}
