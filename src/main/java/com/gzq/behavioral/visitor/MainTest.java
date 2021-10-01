package com.gzq.behavioral.visitor;

public class MainTest {
    public static void main(String[] args) {
        XiaoAi xiaoAi = new XiaoAi();
        xiaoAi.answerQuestion();
        //升级,cpu联网处理指令
        //升级，硬盘保存到云存储
        UpdatePackage updatePackage = new UpdatePackage();

        xiaoAi.acceptUpdate(updatePackage);
        xiaoAi.answerQuestion();

    }
}
