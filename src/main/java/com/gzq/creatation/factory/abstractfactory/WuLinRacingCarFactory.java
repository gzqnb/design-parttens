package com.gzq.creatation.factory.abstractfactory;

//具体工厂 只造车
public class WuLinRacingCarFactory extends WuLinCarFactory{
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }
}
