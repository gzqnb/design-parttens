package com.gzq.behavioral.template;

//1.定义模板
public abstract class CookTemplate {
    //定义算法
    public void cook(){
        //定义算法步骤:定义好了模板，父类可以实现某些步骤
        //留关键给子类
        heating();//✅
        addFood();
        addsalt();
        stirfry();//✅
        end();//✅
    }

    //加热方法
    public void heating(){
        System.out.println("开火。。。");
    }

    //添加食物
    public abstract void addFood();

    //加盐
    public abstract void addsalt();

    //翻炒
    public  void stirfry(){
        System.out.println("翻炒");
    }
    //出锅
    public void end(){
        System.out.println("出锅");
    }
}
