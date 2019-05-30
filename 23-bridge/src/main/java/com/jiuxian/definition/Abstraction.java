package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 16:34:31
 * *
 * @description: 抽象化角色
 **/
public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    //自身的行为和属性
    public void request() {
        this.implementor.doSth();
    }

    //获得实现化角色
    public Implementor getImp() {
        return implementor;
    }
}
