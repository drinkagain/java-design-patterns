package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:21:20
 * *
 * @description: 具体访问者
 **/
public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSth();
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSth();
    }
}
