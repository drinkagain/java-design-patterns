package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:22:25
 * *
 * @description: 具体的被观察者
 **/
public class ConcreteSubject extends Subject {

    public void doSth() {
        //具体的业务逻辑
        System.out.println("ConcreteSubject .. doSth .");
        super.notifyObservers();
    }
}
