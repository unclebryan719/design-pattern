package com.unclebryan.bridge;

/**
 * @program: design-pattern
 * @description: 手机 通过Phone聚合一个品牌，客户端通过Phone间接调用Brand里的方法
 * @author: UncleBryan
 * @created: 2021/06/01 21:37
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
