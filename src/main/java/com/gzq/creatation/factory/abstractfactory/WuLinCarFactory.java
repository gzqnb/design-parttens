package com.gzq.creatation.factory.abstractfactory;

//汽车集团
public abstract class WuLinCarFactory extends WuLinFactory{
    @Override
   abstract AbstractCar newCar();

    @Override
    AbstractMask newMask() {
        return null;
    }
}
