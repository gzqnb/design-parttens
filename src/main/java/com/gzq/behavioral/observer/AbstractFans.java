package com.gzq.behavioral.observer;

/**
 * 粉丝 抽象观察者
 */
public abstract class AbstractFans {
    abstract void acceptMsg(String msg);
    void follow(AbstractTikToker tikToker){
        tikToker.addFans(this);
    }
}
