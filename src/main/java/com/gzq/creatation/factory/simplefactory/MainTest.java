package com.gzq.creatation.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        WuLinSimpleFactory factory = new WuLinSimpleFactory();
        //一切从简
        AbstractCar van = factory.newCar("van");
        AbstractCar mini = factory.newCar("mini");
        van.run();
        mini.run();
    }
}
