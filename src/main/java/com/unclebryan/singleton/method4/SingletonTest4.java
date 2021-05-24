package com.unclebryan.singleton.method4;

/**
 * @program: design-pattern
 * @description: 饿汉式（静态常量）
 * @author: UncleBryan
 * @created: 2021/05/24 22:37
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton{
    private static final Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
}
