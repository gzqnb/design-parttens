package com.gzq.creatation.singleton;

public class Person {
    private String name;
    private String age;

    //懒汉 饿汉
    private volatile static Person instance;

    //    private static Person instance = new Person();//饿汉
    //构造器私有
    private Person() {
        System.out.println("创建了一个person");
    }

    public static Person getPerson() {
        //如果没有实例再创建
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    Person person = new Person();
                    instance = person;
                }
            }

        }
        return instance;
    }
}
