package com.unclebryan.proxy.staticproxy;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 22:22
 */
public class TeacherDaoProxy implements ITeacherDao{
    //目标对象
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理......");
        target.teach();
        System.out.println("提交......");
    }
}
