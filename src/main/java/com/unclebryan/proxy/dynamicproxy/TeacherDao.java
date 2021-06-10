package com.unclebryan.proxy.dynamicproxy;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 22:21
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中......");
    }

    @Override
    public String sayHello(String name) {
        System.out.println("你好，"+name);
        return name;
    }
}
