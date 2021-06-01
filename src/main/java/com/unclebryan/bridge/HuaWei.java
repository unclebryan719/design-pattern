package com.unclebryan.bridge;

/**
 * @program: design-pattern
 * @description: 华为
 * @author: UncleBryan
 * @created: 2021/06/01 21:34
 */
public class HuaWei implements Brand{
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
