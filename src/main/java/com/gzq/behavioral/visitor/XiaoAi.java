package com.gzq.behavioral.visitor;

/**
 * 小爱机器人
 */
public class XiaoAi {
    private CPU cpu = new CPU("西安天气");
    private Disk disk = new Disk("西安天气");
    void answerQuestion(){
        cpu.work();
        disk.work();
    }

    //接受升级包
    public void acceptUpdate(Visitor updatePackage) {
        //升级 访问者:升级包访问小爱同学的cpu！！！！！！！！！！！！！！！！！！！！
        updatePackage.visitCPU(cpu);
        updatePackage.visitDisk(disk);
    }
}
