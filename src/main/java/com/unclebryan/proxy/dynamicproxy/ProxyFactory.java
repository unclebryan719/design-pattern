package com.unclebryan.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design-pattern
 * @description: 代理工厂
 * @author: UncleBryan
 * @created: 2021/06/10 22:50
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始......");
                //通过反射机制调用目标对象方法
                Object invoke = method.invoke(target, args);
                System.out.println("JDK代理提交......");
                return invoke;
            }
        });
    }
}
