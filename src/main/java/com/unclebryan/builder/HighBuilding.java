package com.unclebryan.builder;

/**
 * @program: design-pattern
 * @description: 高楼
 * @author: UncleBryan
 * @created: 2021/05/29 20:58
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void basic() {
        System.out.println("高楼地基");
    }

    @Override
    public void wall() {
        System.out.println("高楼墙");
    }

    @Override
    public void roof() {
        System.out.println("高楼屋顶");
    }
}
