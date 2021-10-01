package com.gzq.behavioral.observer;

public class MainTest {
    public static void main(String[] args) {
        MMTikToker mmTikToker = new MMTikToker();
        RobotFans fans1 = new RobotFans();
        RobotFans fans2 = new RobotFans();
        RobotFans fans3 = new RobotFans();
        HumanFans humanFans = new HumanFans();
        humanFans.follow(mmTikToker);
        fans1.follow(mmTikToker);
        fans2.follow(mmTikToker);
        fans3.follow(mmTikToker);
        mmTikToker.startSell();
        System.out.println("===>");
        mmTikToker.endSell();
    }
}
