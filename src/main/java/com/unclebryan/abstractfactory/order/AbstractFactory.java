package com.unclebryan.abstractfactory.order;

import com.unclebryan.abstractfactory.pizza.Pizza;

/**
 * @program: design-pattern
 * @description: 抽象工厂
 * @author: UncleBryan
 * @created: 2021/05/27 21:58
 */
public interface AbstractFactory {
    public Pizza createPizza(String orderType);
}
