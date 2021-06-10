package com.unclebryan.proxy.staticproxy;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 22:21
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中......");
    }
}
