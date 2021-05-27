package com.unclebryan.abstractfactory.pizza;

/**
 * @program: design-pattern
 * @description: 北京希腊披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println("给北京希腊披萨准备原材料~~~");
    }
}


