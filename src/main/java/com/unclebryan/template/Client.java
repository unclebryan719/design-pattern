package com.unclebryan.template;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/11 00:06
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
