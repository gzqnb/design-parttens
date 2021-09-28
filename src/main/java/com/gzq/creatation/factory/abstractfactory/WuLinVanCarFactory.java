package com.gzq.creatation.factory.abstractfactory;
//分厂:VanCar
public class WuLinVanCarFactory extends WuLinCarFactory{
    @Override
    AbstractCar newCar() {
        return new VanCar();
    }
}
