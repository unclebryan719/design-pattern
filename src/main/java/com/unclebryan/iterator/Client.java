package com.unclebryan.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/11 22:56
 */
public class Client {

    public static void main(String[] args) {
        List<College> collegeList = Lists.newArrayList();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
