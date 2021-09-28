package com.gzq.creatation.factory.abstractfactory;

public class CommonMask extends AbstractMask{
    public CommonMask(){
        price = 1;
    }
    @Override
    public void protectedMe() {
        System.out.println("普通口罩简单保护");
    }
}
