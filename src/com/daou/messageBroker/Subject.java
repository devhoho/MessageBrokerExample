package com.daou.messageBroker;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    void subscribe(Observer observer){
        observers.add(observer);
    }

    void unSubscribe(Observer observer){
        observers.remove(observer);
    }

    void notifyObservers(String msg){
        observers.forEach(o -> o.send(msg));
    }
}
