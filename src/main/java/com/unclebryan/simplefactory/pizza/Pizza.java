package com.unclebryan.simplefactory.pizza;

import lombok.Data;

/**
 * @program: design-pattern
 * @description: 披萨类
 * @author: UncleBryan
 * @created: 2021/05/24 23:29
 */
@Data
public abstract class Pizza {
    protected String name;
    /**
     * 准备
     */
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" baking;");
    }
    public void cut(){
        System.out.println(name+" cutting;");
    }
    public void box(){
        System.out.println(name+" boxing;");
    }

}
