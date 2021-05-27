package com.unclebryan.simplefactory.pizza;

/**
 * @program: design-pattern
 * @description: 胡椒披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料~~~");
    }
}


