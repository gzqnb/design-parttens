package com.gzq.behavioral.state;

/**
 * 吃牛肉面状态
 */
public class BeefNoodleState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("吃饱一顿牛肉面");
    }

    @Override
    public TeamState next() {
        return new MatchState();
    }
}
