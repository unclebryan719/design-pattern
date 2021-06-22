package com.unclebryan.observer;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.Iterator;
import java.util.List;

/**
 * @program: design-pattern
 * @description: 天气信息
 * @author: UncleBryan
 * @created: 2021/06/12 00:03
 */
@Data
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        observers = Lists.newArrayList();
    }

    public void dataChange(){
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            iterator.next().update(this.temperature,this.pressure,this.humidity);
        }
    }
}
