package com.gzq.behavioral.visitor;

public class Disk extends HardWare{
    public Disk(String command) {
        super(command);
    }
    @Override
    public void work() {
        System.out.println("disk保存"+command);
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visitDisk(this);
    }
}
