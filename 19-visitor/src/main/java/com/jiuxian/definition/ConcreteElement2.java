package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:19:51
 * *
 * @description: 具体元素2
 **/
public class ConcreteElement2 extends Element {
    @Override
    public void doSth() {
        System.out.println("ConcreteElement2 do sth.");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
