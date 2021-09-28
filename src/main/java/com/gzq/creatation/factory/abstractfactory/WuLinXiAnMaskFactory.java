package com.gzq.creatation.factory.abstractfactory;

//造口罩不造车
public class WuLinXiAnMaskFactory extends WuLinMaskFactory{


    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}
