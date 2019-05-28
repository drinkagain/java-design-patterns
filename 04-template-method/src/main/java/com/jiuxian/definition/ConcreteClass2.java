package com.jiuxian.definition;

import com.jiuxian.definition.template.AbstractClass;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:51:01
 * *
 * @description: 具体模板类2
 **/
public class ConcreteClass2 extends AbstractClass {

    @Override
    protected void doSomething() {
        //业务逻辑
        System.out.println("ConcreteClass2 doSomething");
    }

    @Override
    protected void doAnyThing() {
        //业务逻辑
        System.out.println("ConcreteClass2 doAnyThing");
    }
}
