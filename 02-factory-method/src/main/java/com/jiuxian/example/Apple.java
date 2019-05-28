package com.jiuxian.example;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:51:00
 * Comment:
 */


public class Apple implements Fruit {

    @Override
    public void getName() {
        System.out.println("我是苹果....");
    }

    @Override
    public void taste() {
        System.out.println("我偿起来酸酸甜甜...");
    }

}
