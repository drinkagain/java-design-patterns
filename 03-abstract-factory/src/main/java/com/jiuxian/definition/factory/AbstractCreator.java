package com.jiuxian.definition.factory;

import com.jiuxian.definition.product.AbstractProductA;
import com.jiuxian.definition.product.AbstractProductB;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 11:44:26
 * *
 * @description: 抽象工厂类
 **/
public abstract class AbstractCreator {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
