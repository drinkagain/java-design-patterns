package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:24:20
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(new ConcreteObserver());

        subject.doSth();
    }
}
