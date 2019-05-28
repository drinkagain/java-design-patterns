package com.jiuxian.definition;

/**
 * Author: liuzejun
 * Date: 2019-05-28 11:09:00
 * Comment: 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
