package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:36:10
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        component = new ConcreteDecorator1(component);

        component = new ConcreteDecorator2(component);

        component.operate();
    }
}
