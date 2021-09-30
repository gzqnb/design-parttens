package com.gzq.structural.facade;

public class MainTest {
    public static void main(String[] args) {
        //太麻烦
//        Police police = new Police();
//        police.register("gzq");
//        Edu edu = new Edu();
//        edu.assignSchool("gzq");
//        Social social = new Social();
//        social.handleSocial("gzq");

        WeiXinFacade weiXinFacade = new WeiXinFacade();
        weiXinFacade.handleXxx("gzq");
    }
}
