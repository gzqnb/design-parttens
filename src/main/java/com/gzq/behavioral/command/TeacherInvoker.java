package com.gzq.behavioral.command;

/**
 * 命令调用者
 */
public class TeacherInvoker {
    Command command;
    public void call(){
        //命令
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
