package com.jiuxian.definition.template;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:49:43
 * *
 * @description: 抽象模板类
 **/
public abstract class AbstractClass {

    protected abstract void doSomething();

    protected abstract void doAnyThing();

    public final void templateMethod() {
        this.doSomething();
        this.doAnyThing();
    }
}
