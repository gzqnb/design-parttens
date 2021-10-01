package com.gzq.behavioral.mediator;

public class SC8633 extends Captain{

    ControllerTower controllerTower;

    public void setControllerTower(ControllerTower controllerTower) {
        this.controllerTower = controllerTower;
    }

    @Override
    void fly() {
        System.out.println("四川请求起飞");
        controllerTower.acceptRequest(this,"fly");
    }

    @Override
    void land() {
        System.out.println("四川请求降落");
        controllerTower.acceptRequest(this,"load");

    }

    @Override
    void success() {
        System.out.println("四川成功...");
        controllerTower.acceptRequest(this,"success");

    }
}
