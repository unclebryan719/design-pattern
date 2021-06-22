package com.unclebryan.visitor;

/**
 * @program: design-pattern
 * @description: 访问者
 * @author: UncleBryan
 * @created: 2021/06/11 21:04
 */
public abstract class Action {
    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
