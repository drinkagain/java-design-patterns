package com.jiuxian.definition;

import com.jiuxian.definition.template.AbstractClass;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:52:05
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        class1.templateMethod();
        class2.templateMethod();
    }
}
