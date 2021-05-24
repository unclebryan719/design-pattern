package com.unclebryan.singleton.method2;

/**
 * @program: design-pattern
 * @description: 通过静态内部类实现单例模式，可以保证线程安全和懒加载
 * @author: UncleBryan
 * @created: 2021/05/24 21:33
 */

public class SingletonTest02{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton {
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){

    }
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
