package com.unclebryan.abstractfactory.order;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/27 21:38
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
