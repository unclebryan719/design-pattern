package com.unclebryan.adapter.classadapter;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/30 21:48
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== 类适配器模式 ===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
