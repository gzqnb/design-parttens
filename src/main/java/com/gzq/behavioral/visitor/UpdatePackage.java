package com.gzq.behavioral.visitor;

public class UpdatePackage implements Visitor {
    @Override
    public void visitDisk(Disk disk) {
        disk.command = "--->联网云存储";
    }

    @Override
    public void visitCPU(CPU cpu) {
        //该属性为例
        cpu.command = ">>>>联网查询中";
//装饰模式，改方法
    }
}
