package com.unclebryan.abstractfactory.order;

import com.unclebryan.abstractfactory.pizza.*;

/**
 * @program: design-pattern
 * @description: 北京工厂
 * @author: UncleBryan
 * @created: 2021/05/27 21:59
 */
public class BJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
