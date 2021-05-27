package com.unclebryan.factorymethod.order;

import com.unclebryan.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: design-pattern
 * @description: 订购披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:38
 */
public abstract class OrderPizza {
    //工厂方法
    abstract Pizza createPizza(String orderType);
    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println(" 订购披萨失败");
                break;
            }
        }while (true);
    }

    private String getType(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza 种类:");
        String str = null;
        try {
            str = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
