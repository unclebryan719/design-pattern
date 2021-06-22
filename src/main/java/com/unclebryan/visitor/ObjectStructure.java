package com.unclebryan.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: design-pattern
 * @description: 数据结构，管理了很多元素-人
 * @author: UncleBryan
 * @created: 2021/06/11 21:10
 */
public class ObjectStructure {
    /**
     * 维护一个元素的集合
     */
    List<Person> people = Lists.newLinkedList();

    /**
     * 添加
     * @param person
     */
    public void attach(Person person){
        people.add(person);
    }

    /**
     * 移除
     * @param person
     */
    public void detach(Person person){
        people.remove(person);
    }

    public void display(Action action){
        for (Person person: people) {
            person.accept(action);
        }
    }
}
