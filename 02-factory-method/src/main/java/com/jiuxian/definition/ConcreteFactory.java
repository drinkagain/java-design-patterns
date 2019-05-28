package com.jiuxian.definition;

/**
 * Author: liuzejun
 * Date: 2019-05-28 11:10:00
 * Comment: 具体工厂类
 */


public class ConcreteFactory extends AbstractFactory {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return null;
    }
}
