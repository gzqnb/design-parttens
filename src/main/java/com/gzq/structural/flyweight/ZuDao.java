package com.gzq.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//足道店：这相当于享元工厂，店里很多服务员
//享元和原型的区别:
//1.享元返回的是这个本人
//2.原型是返回克隆人
public class ZuDao {
    private static Map<String,AbstractWaitressFlyweight> pool = new HashMap<>();
    //享元，池子中有对象,已有服务员
    static {
        BeautifulWaitress waitress = new BeautifulWaitress("111","gzq",18);
        BeautifulWaitress waitress1 = new BeautifulWaitress("121","gzq1",23);
        pool.put(waitress.id,waitress);
        pool.put(waitress1.id,waitress1);
    }

    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight){
        pool.put(UUID.randomUUID().toString(),waitressFlyweight);
    }

    public static AbstractWaitressFlyweight getWaitress(String name){
        AbstractWaitressFlyweight flyweight = pool.get(name);
        if (flyweight==null){
            for (AbstractWaitressFlyweight value : pool.values()) {
                //判断当前共享对象能否使用!!!!!!!!!
                if (value.isCanService()){
                    return value;
                }
            }
            return null;
        }
        if (flyweight.isCanService())
        return flyweight;
        else return null;
    }
}
