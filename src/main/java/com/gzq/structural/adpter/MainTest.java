package com.gzq.structural.adpter;

//适配器
//1.原有系统有两个已存在的接口player和translate并且没有任何关系
//需求，现在一个日本友人看中文不习惯
//2.我们在不改变原有系统的基础上实现这个功能就需要一个适配器
//系统原来存在的接口都不能动。拓展一个新的类，连接两个无关的类
public class MainTest {
    public static void main(String[] args) {
        MoviePlayer moviePlayer = new MoviePlayer();
        moviePlayer.play();

        JPMovieAdapter adapter = new JPMovieAdapter();
        adapter.play();
    }
}
