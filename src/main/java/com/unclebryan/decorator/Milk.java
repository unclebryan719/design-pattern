package com.unclebryan.decorator;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/01 23:01
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(3.0f);
    }
}
