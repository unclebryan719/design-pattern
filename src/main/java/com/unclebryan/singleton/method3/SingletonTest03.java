package com.unclebryan.singleton.method3;

/**
 * @program: design-pattern
 * @description: 枚举方式实现单例模式
 * @author: UncleBryan
 * @created: 2021/05/24 21:49
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 枚举
 */
@SuppressWarnings("AlibabaEnumConstantsMustHaveComment")
enum Singleton{
    INSTANCE;
    public void hello(){
        System.out.println("hello");
    }
}
