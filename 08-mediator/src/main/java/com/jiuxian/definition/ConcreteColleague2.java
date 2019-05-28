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
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        System.out.println("ConcreteColleague2:selfMethod2");
    }

    public void depMethod1() {
        this.mediator.doSth1();
    }
}
