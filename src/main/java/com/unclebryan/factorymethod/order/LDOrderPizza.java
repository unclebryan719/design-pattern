package com.unclebryan.factorymethod.order;

import com.unclebryan.factorymethod.pizza.*;

/**
 * @program: design-pattern
 * @description: 订购伦敦披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:38
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
