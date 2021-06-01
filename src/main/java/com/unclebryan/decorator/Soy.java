package com.unclebryan.decorator;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/01 23:01
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(1.0f);
    }
}
