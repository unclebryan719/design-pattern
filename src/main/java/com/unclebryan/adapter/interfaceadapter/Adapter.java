package com.unclebryan.adapter.interfaceadapter;

/**
 * @program: design-pattern
 * @description: 接口适配器，通过使用抽象类实现接口并进行空实现，
 * 使用者无需直接实现接口所有的方法，只需覆盖适配器中的特定方法即可
 * @author: UncleBryan
 * @created: 2021/05/31 23:40
 */
public abstract class Adapter implements Interface{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}
