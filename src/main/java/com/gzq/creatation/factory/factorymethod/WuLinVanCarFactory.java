package com.gzq.creatation.factory.factorymethod;

public class WuLinVanCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
