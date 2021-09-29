package com.gzq.structural.bridge;

public class IPhone extends AbstractPhone{
    @Override
    String getPhone() {
        return "IPhone"+sale.getSaleInfo();
    }
}
