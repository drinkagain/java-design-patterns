package com.jiuxian.definition;

import com.jiuxian.definition.factory.AbstractCreator;
import com.jiuxian.definition.factory.impl.Creator1;
import com.jiuxian.definition.factory.impl.Creator2;
import com.jiuxian.definition.product.AbstractProductA;
import com.jiuxian.definition.product.AbstractProductB;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 11:48:10
 * *
 * @description: 场景类
 **/
public class Main {
    
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA productA1 = creator1.createProductA();
        productA1.doSth();

        AbstractProductA productA2 = creator2.createProductA();
        productA2.doSth();

        AbstractProductB productB1 = creator1.createProductB();
        productB1.doSth();

        AbstractProductB productB2 = creator2.createProductB();
        productB2.doSth();

    }
}
