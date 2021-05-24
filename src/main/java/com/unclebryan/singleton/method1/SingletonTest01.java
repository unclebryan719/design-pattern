package com.unclebryan.singleton.method1;

/**
 * @program: design-pattern
 * @description: 双重检查实现单例模式，可以保证线程安全和懒加载
 * @author: UncleBryan
 * @created: 2021/05/24 21:24
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton{
    private static volatile Singleton singleton;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}