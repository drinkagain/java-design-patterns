package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:22:36
 * *
 * @description: 具体装饰类1
 **/
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method() {
        System.out.println("ConcreteDecorator2 method 进行装饰");
    }

    @Override
    public void operate() {

        super.operate();

        this.method();
    }
}
