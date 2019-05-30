package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:18:38
 * *
 * @description: 抽象访问者
 **/
public interface IVisitor {

    void visit(ConcreteElement1 concreteElement1);

    void visit(ConcreteElement2 concreteElement2);
}
