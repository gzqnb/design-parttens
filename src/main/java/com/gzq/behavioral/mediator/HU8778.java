package com.gzq.behavioral.mediator;

/**
 * 海南8778
 */
public class HU8778 extends Captain{
    ControllerTower controllerTower;

    public void setControllerTower(ControllerTower controllerTower) {
        this.controllerTower = controllerTower;
    }
    @Override
    void fly() {
        System.out.println("海南航空请求起飞");
        //问每个机长能否起飞?
        controllerTower.acceptRequest(this,"fly");
    }

    @Override
    void land() {
        System.out.println("海南航空请求降落");
        controllerTower.acceptRequest(this,"load");
    }

    @Override
    void success() {
        System.out.println("完成...");
        controllerTower.acceptRequest(this,"success");
    }
}
