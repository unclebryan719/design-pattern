package com.unclebryan.simplefactory.pizza;

/**
 * @program: design-pattern
 * @description: 希腊披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料~~~");
    }
}


