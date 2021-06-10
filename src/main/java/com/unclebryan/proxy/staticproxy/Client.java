package com.unclebryan.proxy.staticproxy;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 22:24
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao target = new TeacherDao();
        //创建代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(target);

        proxy.teach();
    }
}
