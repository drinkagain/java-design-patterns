package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:19:51
 * *
 * @description: 具体元素1
 **/
public class ConcreteElement1 extends Element {
    @Override
    public void doSth() {
        System.out.println("ConcreteElement1 do sth.");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
