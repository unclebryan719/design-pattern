package com.unclebryan.factorymethod.pizza;

/**
 * @program: design-pattern
 * @description: 伦敦希腊披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦希腊披萨");
        System.out.println("给伦敦希腊披萨准备原材料~~~");
    }
}


