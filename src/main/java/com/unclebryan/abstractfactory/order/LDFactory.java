package com.unclebryan.abstractfactory.order;

import com.unclebryan.abstractfactory.pizza.LDCheesePizza;
import com.unclebryan.abstractfactory.pizza.LDGreekPizza;
import com.unclebryan.abstractfactory.pizza.Pizza;

/**
 * @program: design-pattern
 * @description: 伦敦工厂
 * @author: UncleBryan
 * @created: 2021/05/27 21:59
 */
public class LDFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
