package com.unclebryan.simplefactory.order;

import com.unclebryan.simplefactory.pizza.*;

/**
 * @program: design-pattern
 * @description: 简单工厂模式
 * @author: UncleBryan
 * @created: 2021/05/24 23:29
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza =null;
        System.out.println("简单工厂模式");
        if("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }else if("china".equals(orderType)){
            pizza = new ChinaPizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }

}
