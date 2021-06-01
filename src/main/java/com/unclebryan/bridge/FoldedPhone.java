package com.unclebryan.bridge;

/**
 * @program: design-pattern
 * @description: 折叠手机
 * @author: UncleBryan
 * @created: 2021/06/01 21:38
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机已开机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机已关机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机正在打电话");
    }
}
