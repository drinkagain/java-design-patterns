package com.jiuxian.definition;

/**
 * Author: liuzejun
 * Date: 2019-05-28 11:11:00
 * Comment: 场景类
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        Product1 product = factory.createProduct(Product1.class);
        product.method();
    }
}
