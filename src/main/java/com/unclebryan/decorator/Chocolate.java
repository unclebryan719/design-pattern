package com.unclebryan.decorator;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/01 23:01
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(2.0f);
    }
}
