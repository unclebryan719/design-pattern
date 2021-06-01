package com.unclebryan.builder;

/**
 * @program: design-pattern
 * @description: 调用
 * @author: UncleBryan
 * @created: 2021/05/29 20:55
 */
public class Client {
    public static void main(String[] args) {
//        CommonHouse commonHouse = new CommonHouse();
//        Director director = new Director(commonHouse);
//        director.build();
        HighBuilding highBuilding = new HighBuilding();
        Director director = new Director(highBuilding);
        director.build();
    }
}
