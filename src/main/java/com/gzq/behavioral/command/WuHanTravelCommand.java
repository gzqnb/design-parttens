package com.gzq.behavioral.command;

/**
 * 武汉出差实现
 */
public class WuHanTravelCommand implements Command{

    private GuoReceiver receiver;
    @Override
    public void execute() {
        System.out.println("我要出差");
        receiver.travel();
    }

    public void setReceiver(GuoReceiver receiver) {
        this.receiver = receiver;
    }
}
