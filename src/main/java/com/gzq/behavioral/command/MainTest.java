package com.gzq.behavioral.command;

public class MainTest {
    public static void main(String[] args) {
        GuoReceiver guoReceiver = new GuoReceiver();
        OnlineCommand onlineCommand = new OnlineCommand();
        onlineCommand.setReceiver(guoReceiver);
        TeacherInvoker teacherInvoker = new TeacherInvoker();
        teacherInvoker.setCommand(onlineCommand);
        teacherInvoker.call();
    }
}
