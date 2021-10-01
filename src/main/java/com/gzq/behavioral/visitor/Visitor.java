package com.gzq.behavioral.visitor;

/**
 * 升级包的接口
 */
public interface Visitor {
    //访问者能够访问元素
    public void visitDisk(Disk disk);

    public void visitCPU(CPU cpu);
}
