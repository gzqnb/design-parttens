package com.gzq.behavioral.command;

/**
 * 抽象类命令
 * Controller,Service,Dao接口
 */
public interface Command {
    /**
     * 命令执行的方法
     */
    void execute();
}
