package com.unclebryan.decorator;

/**
 * @program: design-pattern
 * @description: 装饰器
 * @author: UncleBryan
 * @created: 2021/06/01 22:59
 */
public class Decorator extends Drink{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        //super.getDescription()装饰者自己的描述
        //super.getPrice() 装饰者自己的价格
        //drink.getDescription()被装饰者的描述
        //drink.getPrice()被装饰者的价格
        return super.getDescription()+"&&"+drink.getDescription();
    }
}
