package com.unclebryan.iterator;

import java.util.Iterator;

/**
 * @program: design-pattern
 * @description: 计算机学院迭代器
 * @author: UncleBryan
 * @created: 2021/06/11 22:30
 */
public class ComputerCollegeIterator implements Iterator {
    /**
     * 数组方式存储对象
     */
    Department[] departments;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     *遍历的位置
     */
    int position = 0;
    @Override
    public boolean hasNext() {
        if(position>=departments.length || departments[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position ++;
        return department;
    }
}
