package com.unclebryan.proxy.dynamicproxy;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 22:54
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
//        proxyInstance.teach();
        proxyInstance.sayHello("张三");
    }
}
