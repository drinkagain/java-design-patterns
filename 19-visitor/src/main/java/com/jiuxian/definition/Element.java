package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:17:40
 * *
 * @description: 抽象元素
 **/
public abstract class Element {

    public abstract void doSth();

    public abstract void accept(IVisitor visitor);
}
