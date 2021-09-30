package com.gzq.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//使用cglib帮我们创建出代理对象
public class CglibProxy {
    //为任意对象创建代理
    public static <T> T createProxy(T t){
        //1.创建一个增强器
        Enhancer enhancer = new Enhancer();
        //2.设置要增强哪个类的功能,增强器为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());
        //3.设置方法回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj,
                                    Method method, //为了能获取原方法的一些元数据信息
                                    Object[] args,
                                    MethodProxy proxy) throws Throwable {
                //编写拦截的逻辑
                System.out.println("cglib上场了。。。");
                //目标方法进行执行
                Object invoke = proxy.invokeSuper(obj, args);
                return invoke;
            }
        });//核心！！！！！！！！！！
        return (T) enhancer.create();
    }
}
