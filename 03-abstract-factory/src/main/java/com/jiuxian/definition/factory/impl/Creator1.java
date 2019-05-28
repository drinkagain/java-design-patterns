package com.jiuxian.definition.factory.impl;

import com.jiuxian.definition.product.AbstractProductA;
import com.jiuxian.definition.product.AbstractProductB;
import com.jiuxian.definition.product.impl.ProductA1;
import com.jiuxian.definition.product.impl.ProductB1;
import com.jiuxian.definition.factory.AbstractCreator;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 11:45:46
 * *
 * @description: 产品等级1的实现
 **/
public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
