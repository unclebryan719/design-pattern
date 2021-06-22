package com.unclebryan.observer;

/**
 * @Description: 观察者接口
 * @Creator: UncleBryan
 * @Date: 2021/6/11 11:57 PM
 *
 */
public interface Observer {
    /**
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    void update(float temperature, float pressure, float humidity);
}
