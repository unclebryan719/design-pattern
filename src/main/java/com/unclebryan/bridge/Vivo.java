package com.unclebryan.bridge;

/**
 * @program: design-pattern
 * @description: Vivo
 * @author: UncleBryan
 * @created: 2021/06/01 21:36
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }
}
