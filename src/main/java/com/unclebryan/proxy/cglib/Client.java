package com.unclebryan.proxy.cglib;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 23:26
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
