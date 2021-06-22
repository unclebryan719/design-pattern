package com.unclebryan.iterator;

import java.util.Iterator;

/**
 * @program: design-pattern
 * @description: 计算机学院
 * @author: UncleBryan
 * @created: 2021/06/11 22:19
 */
public class ComputerCollege implements College{
    private Department[] departments;
    int numOfDepartment = 0;
    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业","Java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("Python专业","Python专业");
        addDepartment("IOS专业","IOS专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        Department department = new Department(name,description);
        departments[numOfDepartment] = department;
        numOfDepartment ++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
