package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 15:34:41
 * *
 * @description: 通用中介者
 **/
public class ConcreteMediator extends Mediator {


    @Override
    public void doSth1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSth2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
