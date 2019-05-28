package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:12:17
 * *
 * @description: 具体建造者
 **/
public class ConcreteProduct extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {
        //产品类内的逻辑处理
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
