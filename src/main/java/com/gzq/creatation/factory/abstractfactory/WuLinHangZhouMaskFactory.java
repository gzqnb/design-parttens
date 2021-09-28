package com.gzq.creatation.factory.abstractfactory;

//分厂只造口罩
public class WuLinHangZhouMaskFactory extends WuLinMaskFactory{


    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }
}
