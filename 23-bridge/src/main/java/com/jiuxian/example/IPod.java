package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 16:47:38
 * *
 * @description: iPod 产品
 **/
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
