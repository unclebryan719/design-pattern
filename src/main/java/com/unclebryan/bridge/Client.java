package com.unclebryan.bridge;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/01 21:41
 */
public class Client {
    public static void main(String[] args) {
        Phone huaWeiFoldedPhone = new FoldedPhone(new HuaWei());
        huaWeiFoldedPhone.open();
        huaWeiFoldedPhone.call();
        huaWeiFoldedPhone.close();
        System.out.println("===================");
        Phone vivoFoldedPhone = new FoldedPhone(new Vivo());
        vivoFoldedPhone.open();
        vivoFoldedPhone.call();
        vivoFoldedPhone.close();

        Phone huaWeiBarPhone = new BarPhone(new HuaWei());
        huaWeiBarPhone.open();
        huaWeiBarPhone.call();
        huaWeiBarPhone.close();
        System.out.println("===================");
        Phone vivoBarPhone = new BarPhone(new Vivo());
        vivoBarPhone.open();
        vivoBarPhone.call();
        vivoBarPhone.close();



    }
}
