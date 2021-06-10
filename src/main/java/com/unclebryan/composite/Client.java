package com.unclebryan.composite;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/03 21:10
 */
public class Client {
    public static void main(String[] args) {

        OrganizationComponent university = new University("天津大学","天津最好的大学之一");

        OrganizationComponent department1 = new Department("数学系","科学的基石");

        OrganizationComponent department2 = new Department("计算机系","未来的方向");

        OrganizationComponent class1 = new Clazz("数学一班","非常棒");
        OrganizationComponent class2 = new Clazz("数学二班","也很棒");
        OrganizationComponent class3 = new Clazz("计算机一班","编程高手");
        OrganizationComponent class4 = new Clazz("计算机二班","运维高手");

        department1.add(class1);
        department1.add(class2);
        department2.add(class3);
        department2.add(class4);
        university.add(department1);
        university.add(department2);

        university.print();
    }
}
