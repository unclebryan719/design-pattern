package com.unclebryan.adapter.objectadapter;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/30 21:42
 */
public class VoltageAdapter implements IVoltage5V {
    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if(null != voltage220V){
            int srcV = voltage220V.output220V();
            dstV = srcV / 44;
        }
        return dstV;
    }
}
