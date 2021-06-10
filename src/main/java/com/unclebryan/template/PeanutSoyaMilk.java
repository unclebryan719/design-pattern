package com.unclebryan.template;

/**
 * @program: design-pattern
 * @description: 花生豆浆
 * @author: UncleBryan
 * @created: 2021/06/10 23:50
 */
public class PeanutSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
