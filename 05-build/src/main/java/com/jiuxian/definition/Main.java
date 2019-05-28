package com.jiuxian.definition;

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
        Director director = new Director();
        Product product = director.getProduct();
        product.doSth();
    }
}
