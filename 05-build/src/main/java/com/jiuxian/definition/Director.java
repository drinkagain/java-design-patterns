package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:13:15
 * *
 * @description: 导演类
 **/
public class Director {
    private Builder builder = new ConcreteProduct();

    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
