package com.unclebryan.bridge;

/**
 * @program: design-pattern
 * @description: 直板手机
 * @author: UncleBryan
 * @created: 2021/06/01 21:38
 */
public class BarPhone extends Phone{
    public BarPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直板手机已开机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直板手机已关机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直板手机正在打电话");
    }
}
