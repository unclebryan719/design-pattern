package com.unclebryan.builder;

/**
 * @program: design-pattern
 * @description: 建造者的具体实现
 * @author: UncleBryan
 * @created: 2021/05/29 20:44
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void basic() {
        System.out.println("普通房子地基");
    }

    @Override
    public void wall() {
        System.out.println("普通房子墙");
    }

    @Override
    public void roof() {
        System.out.println("普通房子屋顶");
    }
}
