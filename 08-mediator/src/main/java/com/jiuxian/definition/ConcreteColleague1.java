package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 15:32:07
 * *
 * @description: 具体同事类1
 **/
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("ConcreteColleague1:selfMethod1");

    }

    public void depMethod2() {
        this.mediator.doSth2();
    }
}
