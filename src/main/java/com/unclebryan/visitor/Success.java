package com.unclebryan.visitor;

/**
 * @program: design-pattern
 * @description: 访问者的实现
 * @author: UncleBryan
 * @created: 2021/06/11 21:05
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是成功~~~");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是成功~~~");
    }
}
