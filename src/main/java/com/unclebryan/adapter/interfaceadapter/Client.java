package com.unclebryan.adapter.interfaceadapter;

/**
 * @program: design-pattern
 * @description: 客户端
 * @author: UncleBryan
 * @created: 2021/05/31 23:41
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter() {
            @Override
            public void m1() {
                System.out.println("使用m1方法");
            }
        };
        adapter.m1();
    }
}
