package com.gzq.creatation.factory.factorymethod;

public class WuLinRacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
