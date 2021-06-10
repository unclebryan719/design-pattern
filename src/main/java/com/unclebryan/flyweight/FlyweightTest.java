package com.unclebryan.flyweight;

import java.util.Objects;

/**
 * @program: design-pattern
 * @description: Integer.valueOf测试
 * @author: UncleBryan
 * @created: 2021/06/10 22:01
 */
public class FlyweightTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
        Integer c = Integer.valueOf(128);
        Integer d = Integer.valueOf(128);

        //true
        System.out.println(a == b);

        //false
        System.out.println(c == d);

    }
}
