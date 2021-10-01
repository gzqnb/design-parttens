package com.gzq.behavioral.command;

/**
 * 线上课命令
 */
public class OnlineCommand implements Command{
    private GuoReceiver receiver;

    @Override
    public void execute() {
        System.out.println("我要去上课");
        receiver.online();
    }

    public void setReceiver(GuoReceiver receiver) {
        this.receiver = receiver;
    }
}
