package com.unclebryan.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @program: design-pattern
 * @description: 信息工程学院迭代器
 * @author: UncleBryan
 * @created: 2021/06/11 22:37
 */
public class InfoCollegeIterator implements Iterator {
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size()-1){
            return false;
        }
        index ++;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
