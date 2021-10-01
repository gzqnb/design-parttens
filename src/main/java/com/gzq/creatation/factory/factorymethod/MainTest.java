package com.gzq.creatation.factory.factorymethod;

public class MainTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new WuLinVanCarFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();
        carFactory = new WuLinMiniCarFactory();
        AbstractCar abstractCar1 = carFactory.newCar();
        abstractCar1.run();
    }
}
