package com.unclebryan.observer;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/12 00:10
 */
public class Client {
    public static void main(String[] args) {
        //创建subject
        WeatherData weatherData = new WeatherData();

        //创建观察者并注册到subject
        BaiduSite baiduSite = new BaiduSite();
        SinaSite sinaSite = new SinaSite();
        weatherData.registObserver(baiduSite);
        weatherData.registObserver(sinaSite);
        //设置当前温度气压与湿度并通知各个观察者
        weatherData.setData(30f,1000f, 20.1f);

    }
}
