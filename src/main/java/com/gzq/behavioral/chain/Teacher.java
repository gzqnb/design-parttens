package com.gzq.behavioral.chain;

import lombok.ToString;

@ToString
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    //1.链条的引用
    private Teacher next;//下一个处理的老师

    void handleRequest() {
        System.out.println(this + "---正在处理");
        //2.下一个继续
        if (next != null)
            next.handleRequest();
    }

    public Teacher getNext() {
        return next;
    }

    public void setNext(Teacher next) {
        this.next = next;
    }
}
