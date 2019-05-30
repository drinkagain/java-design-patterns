package com.jiuxian.definition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:19:03
 * *
 * @description: 被观察者
 **/
public abstract class Subject {

    private List<Observer> observers = Collections.synchronizedList(new ArrayList<>());


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }


}
