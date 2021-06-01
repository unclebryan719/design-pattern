package com.unclebryan.builder;


/**
 * @program: design-pattern
 * @description: 指挥者
 * @author: UncleBryan
 * @created: 2021/05/29 20:46
 */
public class Director {
    /**
     * 指挥者聚合建造者进行产品制造
     */
    HouseBuilder builder;
    public Director(HouseBuilder builder){
        this.builder = builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public House build(){
        builder.basic();
        builder.wall();
        builder.roof();
        return builder.buildHouse();
    }
}
