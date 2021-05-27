package com.unclebryan.simplefactory.pizza;

/**
 * @program: design-pattern
 * @description: 奶酪披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料~~~");
    }
}


