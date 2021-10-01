package com.gzq.behavioral.state;

/**
 * 抽象状态
 */
public interface TeamState {

    //玩游戏
    void playGame();

    //切换到下一个状态！！！！！！！！！核心
    TeamState next();
}
