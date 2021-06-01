package com.unclebryan.decorator;

/**
 * @program: design-pattern
 * @description: 咖啡店
 * @author: UncleBryan
 * @created: 2021/06/01 23:14
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("LongBlack"+":"+order.cost());
        order = new Milk(order);
        System.out.println("加入Milk后的价格"+":"+order.cost()+",Milk的价格为："+order.getPrice());
        order = new Chocolate(order);
        System.out.println("加入Chocolate后的价格"+":"+order.cost()+",Chocolate的价格为："+order.getPrice());
        System.out.println(order.getDescription());
    }
}
