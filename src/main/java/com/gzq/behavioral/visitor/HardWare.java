package com.gzq.behavioral.visitor;

/**
 * 硬件 抽象元素
 */
public abstract class HardWare {
    String command;//封装硬件的处理指令
    public HardWare(String command){
        this.command = command;
    }
    //收到命令以后进行工作
    public abstract  void work();
    //定义接收软件升级包的方法。这个方法应该具体硬件去实现
    public abstract void accept(Visitor vistor);
}
