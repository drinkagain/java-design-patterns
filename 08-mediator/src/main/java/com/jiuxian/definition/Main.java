package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:56:18
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        mediator.setC1(new ConcreteColleague1(mediator));
        mediator.setC2(new ConcreteColleague2(mediator));
        mediator.doSth1();
        mediator.doSth2();
    }
}
