package com.jiuxian.definition;

import com.jiuxian.definition.template.AbstractClass;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:51:01
 * *
 * @description: 具体模板类1
 **/
public class ConcreteClass1 extends AbstractClass {

    @Override
    protected void doSomething() {
        //业务逻辑
        System.out.println("ConcreteClass1 doSomething");
    }

    @Override
    protected void doAnyThing() {
        //业务逻辑
        System.out.println("ConcreteClass1 doAnyThing");
    }
}
