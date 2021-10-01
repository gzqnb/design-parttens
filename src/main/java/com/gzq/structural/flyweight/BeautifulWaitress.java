package com.gzq.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * 具体享元类
 */
@AllArgsConstructor
@ToString
public class BeautifulWaitress extends AbstractWaitressFlyweight {
    String id;//工号
    String name;//名字
    int age;//年龄
    //以上是不变的



    @Override
    void service() {
        System.out.println("工号"+id+":"+name+" "+age+"为您服务");
        //改变外部状态
        this.canService = false;
    }

    @Override
    void end() {
        System.out.println("工号"+id+":"+name+" "+age+"服务结束");
        this.canService = true;
    }
}
