package com.jiuxian.example;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:52:00
 * Comment: 抽象水果工厂
 */


public abstract class AbstractFruitsFactory {

    public abstract <T extends Fruit> T createFruit(Class<T> clazz);
}
