package com.gzq.behavioral.mediator;

public class XC9527 extends Captain{
    ControllerTower controllerTower;

    public void setControllerTower(ControllerTower controllerTower) {
        this.controllerTower = controllerTower;
    }
    @Override
    void fly() {
        System.out.println("星星请求起飞");
        controllerTower.acceptRequest(this,"fly");
    }

    @Override
    void land() {
        System.out.println("星星请求降落");
        controllerTower.acceptRequest(this,"load");

    }

    @Override
    void success() {
        System.out.println("星星完成...");
        controllerTower.acceptRequest(this,"success");

    }
}
