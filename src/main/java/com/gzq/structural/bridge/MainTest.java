package com.gzq.structural.bridge;

//系统设计期间，如果这个类里面的一些东西，会扩展很多，这个东西就应该分离出来
//省去了很多类
public class MainTest {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setSale(new OfflineSale("线下",9999));
        String phone = iPhone.getPhone();
        System.out.println(phone);
    }
}
