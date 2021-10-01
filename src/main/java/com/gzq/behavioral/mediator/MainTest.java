package com.gzq.behavioral.mediator;

public class MainTest {
    public static void main(String[] args) {
        HU8778 hu8778 = new HU8778();
        SC8633 sc8633 = new SC8633();
        ControllerTower controllerTower = new ControllerTower();
        hu8778.setControllerTower(controllerTower);
        sc8633.setControllerTower(controllerTower);
        hu8778.fly();
        hu8778.success();
        sc8633.fly();
    }
}
