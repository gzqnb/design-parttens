package com.gzq.behavioral.template;

public class AutoCookMachine extends CookTemplate{

    @Override
    public void addFood() {
        System.out.println("放白菜");
    }

    @Override
    public void addsalt() {
        System.out.println("放了盐");
    }
}
