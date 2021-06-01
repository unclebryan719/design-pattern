package com.unclebryan.adapter.objectadapter;

/**
 * @program: design-pattern
 * @description: 220V电压 被适配者
 * @author: UncleBryan
 * @created: 2021/05/30 21:38
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("电压="+220);
        return src;
    }
}
