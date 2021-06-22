package com.unclebryan.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @program: design-pattern
 * @description: 输出方法
 * @author: UncleBryan
 * @created: 2021/06/11 22:49
 */
public class OutputImpl {
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("===="+college.getName()+"====");
            printDepartment(college.createIterator());
        }
    }
    /**
     *
     */
    public void printDepartment(Iterator<Department> iterator){
        while (iterator.hasNext()){
            Department department = iterator.next();
            System.out.println(department.getName());
        }
    }
}
