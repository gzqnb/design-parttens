package com.gzq.behavioral.state;

/**
 * 休假状态
 */
public class VocationState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("饿了不玩游戏");
    }

    @Override
    public TeamState next() {
        return new BeefNoodleState();
    }
}
