package com.unclebryan.simplefactory.pizza;

/**
 * @program: design-pattern
 * @description: 中国披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class ChinaPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给中国披萨准备原材料~~~");
    }
}


