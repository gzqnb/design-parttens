package com.gzq.structural.facade;


public class WeiXinFacade {
    Police police = new Police();
    Edu edu = new Edu();
    Social social = new Social();

    /**
     * 封装起来只留一个方法，也可以分开
     * @param name
     */
    public void handleXxx(String name){
        police.register(name);
        edu.assignSchool(name);
        social.handleSocial(name);
    }
    //分开也可以...
    public void police(String name){
        police.register(name);
    }
}
