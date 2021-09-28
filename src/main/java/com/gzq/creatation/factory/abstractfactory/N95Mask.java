package com.gzq.creatation.factory.abstractfactory;

//具体产品
public class N95Mask extends AbstractMask{
    public N95Mask(){
        this.price = 2;
    }
    @Override
    public void protectedMe() {
        System.out.println("超级保护");
    }
}
