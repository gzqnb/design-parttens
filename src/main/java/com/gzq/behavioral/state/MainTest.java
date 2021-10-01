package com.gzq.behavioral.state;

/**
 * 状态切换
 */
public class MainTest {
    public static void main(String[] args) {
        SKTTeam sktTeam = new SKTTeam();
        VocationState state = new VocationState();
        sktTeam.setTeamState(state);

        sktTeam.startGame();
        sktTeam.nextState();//状态切换
        sktTeam.startGame();
        sktTeam.nextState();
        sktTeam.startGame();
    }
}
