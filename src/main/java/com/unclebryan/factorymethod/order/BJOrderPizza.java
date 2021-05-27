package com.unclebryan.factorymethod.order;

import com.unclebryan.factorymethod.pizza.BJCheesePizza;
import com.unclebryan.factorymethod.pizza.BJGreekPizza;
import com.unclebryan.factorymethod.pizza.Pizza;

/**
 * @program: design-pattern
 * @description: 订购北京披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:38
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
