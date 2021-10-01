package com.gzq.behavioral.strategy;

public class MainTest {
    public static void main(String[] args) {
        TeamGNR gnr = new TeamGNR();
        gnr.setGameStrategy(new UziStrategy());
        gnr.startGame();
    }
}
