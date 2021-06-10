package com.unclebryan.proxy.dynamicproxy;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 22:21
 */
public interface ITeacherDao {
    /**
     * 授课
     */
    void teach();

    /**
     * 打招呼
     * @param name
     * @return
     */
    String sayHello(String name);

}
