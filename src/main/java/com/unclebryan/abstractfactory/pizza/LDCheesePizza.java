package com.unclebryan.abstractfactory.pizza;

/**
 * @program: design-pattern
 * @description: 伦敦奶酪披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:30
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("给伦敦奶酪披萨准备原材料~~~");
    }
}


