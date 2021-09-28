package com.gzq.creatation.factory.factorymethod;

public class WuLinMiniCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
