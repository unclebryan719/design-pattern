package com.unclebryan.decorator;

/**
 * @program: design-pattern
 * @description: 被装饰者
 * @author: UncleBryan
 * @created: 2021/06/01 22:40
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return getPrice();
    }
}
