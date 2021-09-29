package com.gzq.structural.adpter;

public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("正在播放:鱿鱼游戏");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
