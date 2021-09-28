package com.gzq.creatation.factory.abstractfactory;

//WuLin口罩集团
public abstract class WuLinMaskFactory extends WuLinFactory{
    @Override
    AbstractCar newCar() {
        return null;
    }

    @Override
    abstract AbstractMask newMask();
}
