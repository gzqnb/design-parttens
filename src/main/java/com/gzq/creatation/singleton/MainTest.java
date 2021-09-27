package com.gzq.creatation.singleton;

public class MainTest {
    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person1==person2);
    }
}
