package com.unclebryan.iterator;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * @program: design-pattern
 * @description: 信息工程系
 * @author: UncleBryan
 * @created: 2021/06/11 22:44
 */
public class InfoCollege implements College{
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = Lists.newArrayList();
        addDepartment("信息安全","信息安全");
        addDepartment("网络安全","网络安全");
    }

    @Override
    public String getName() {
        return "信息工程系";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name, description);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
