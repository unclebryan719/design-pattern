package com.unclebryan.prototype;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/27 22:50
 */
public class Client {
    public static void main(String[] args) {
        Sheep friend = new Sheep("Jack",12,null);
        Sheep sheep = new Sheep("Tom",10,friend);
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println("sheep:"+sheep+"sheep.getFriend().hashCode():"+sheep.getFriend().hashCode());
        System.out.println("sheep1:"+sheep1+"sheep1.getFriend().hashCode():"+sheep1.getFriend().hashCode());
        System.out.println("sheep2:"+sheep2+"sheep2.getFriend().hashCode():"+sheep2.getFriend().hashCode());
        System.out.println("sheep3:"+sheep3+"sheep3.getFriend().hashCode():"+sheep3.getFriend().hashCode());
        System.out.println("sheep4:"+sheep4+"sheep4.getFriend().hashCode():"+sheep4.getFriend().hashCode());
    }
}
