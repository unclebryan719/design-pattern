package com.unclebryan.adapter.objectadapter;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/30 21:45
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("电压为5V，可以充电~");
        }else if (iVoltage5V.output5V()>5){
            System.out.println("电压大于5V，不能充电~");
        }

    }
}
