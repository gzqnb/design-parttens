package com.gzq.behavioral.visitor;

public class CPU extends HardWare{
    public CPU(String command) {
        super(command);
    }

    @Override
    public void work() {
        System.out.println("cpu处理"+command);
    }

    //元素能接受访问者
    @Override
    public void accept(Visitor visitor) {
        //给升级包提供一个改CPU指令信息的方法
visitor.visitCPU(this);
    }
}
