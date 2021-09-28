package com.gzq.creatation.factory.simplefactory;

public class WuLinSimpleFactory {
    public AbstractCar newCar(String type){
        if ("van".equals(type)){
            return new VanCar();
        }else if ("mini".equals(type)){
            return new MiniCar();
        }
        //更多的产品，违反开闭原则，应该直接拓展出一个类来造
        return null;
    }
}
