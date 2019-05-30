package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:23:40
 * *
 * @description: 具体观察者
 **/
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("ConcreteObserver 接收到信息，并进行处理。。。");
    }
}
