package com.unclebryan.simplefactory.order;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/27 20:47
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
