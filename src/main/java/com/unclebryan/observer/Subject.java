package com.unclebryan.observer;

public interface Subject {
    /**
     *
     * @param observer
     */
    void registObserver(Observer observer);
    /**
     *
     * @param observer
     */
    void removeObserver(Observer observer);
    /**
     *
     */
    void notifyObservers();
}
