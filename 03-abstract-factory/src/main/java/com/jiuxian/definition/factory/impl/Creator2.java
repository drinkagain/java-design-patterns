package com.jiuxian.definition.factory.impl;

import com.jiuxian.definition.product.AbstractProductA;
import com.jiuxian.definition.product.AbstractProductB;
import com.jiuxian.definition.product.impl.ProductA2;
import com.jiuxian.definition.product.impl.ProductB2;
import com.jiuxian.definition.factory.AbstractCreator;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 11:45:46
 * *
 * @description: 产品等级2的实现
 **/
public class Creator2 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
