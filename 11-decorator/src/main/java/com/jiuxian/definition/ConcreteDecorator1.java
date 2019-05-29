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
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("ConcreteDecorator1 method1 进行装饰");
    }

    private void method2() {
        System.out.println("ConcreteDecorator1 method2 进行装饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
        this.method2();
    }
}
