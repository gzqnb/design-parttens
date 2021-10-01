package com.gzq.behavioral.strategy;

public class SteadyStrategy implements GameStrategy{
    @Override
    public void warStrategy() {
        System.out.println("各路小心 及时支援");
    }
}
