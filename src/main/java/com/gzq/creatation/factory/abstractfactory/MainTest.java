package com.gzq.creatation.factory.abstractfactory;

//抽象出来，可以抽象成接口(只有方法)，可以抽象成抽象类(有些属性也需要用，可以通过继承抽象类)
public class MainTest {
    public static void main(String[] args) {
        WuLinFactory wuLinFactory = new WuLinXiAnMaskFactory();
        AbstractCar abstractCar = wuLinFactory.newCar();

        AbstractMask abstractMask = wuLinFactory.newMask();
        abstractMask.protectedMe();

    }
}
