package com.unclebryan.simplefactory.order;

import com.unclebryan.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: design-pattern
 * @description: 订购披萨
 * @author: UncleBryan
 * @created: 2021/05/24 23:38
 */
public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
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
