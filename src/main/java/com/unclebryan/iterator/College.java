package com.unclebryan.iterator;

import java.util.Iterator;

/**
 * @program: design-pattern
 * @description: 学院
 * @author: UncleBryan
 * @created: 2021/06/11 22:16
 */
public interface College {
    String getName();

    /**
     * 增加系的方法
     * @param name
     * @param description
     */
    void addDepartment(String name, String description);

    /**
     * 创建一个迭代器
     * @return
     */
    Iterator createIterator();
}
