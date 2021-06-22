package com.unclebryan.visitor;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/11 21:03
 */
public abstract class Person {
    public abstract void accept(Action action);
}
