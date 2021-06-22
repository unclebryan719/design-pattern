package com.unclebryan.visitor;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/11 21:18
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Man man = new Man();
        objectStructure.attach(man);
        objectStructure.attach(man);
        objectStructure.attach(man);

        //成功
        Success success = new Success();
        objectStructure.display(success);
    }
}
