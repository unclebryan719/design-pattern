package com.unclebryan.observer;

/**
 * @program: design-pattern
 * @description: 观察者实现类
 * @author: UncleBryan
 * @created: 2021/06/11 23:58
 */
public class BaiduSite implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("---------百度网站温度提示---------");
        System.out.println("***百度网站温度："+ temperature + "***");
        System.out.println("***百度网站气压："+ pressure + "***");
        System.out.println("***百度网站湿度："+ humidity + "***");
    }
}
