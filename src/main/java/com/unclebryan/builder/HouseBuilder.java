package com.unclebryan.builder;

/**
 * @program: design-pattern
 * @description: 建造者
 * @author: UncleBryan
 * @created: 2021/05/29 20:42
 */
public abstract class HouseBuilder {
    //建造者组合产品
    protected  House house = new House();

    public abstract void basic();

    public abstract void wall();

    public abstract void roof();

    public House buildHouse(){
        return house;
    }
}
