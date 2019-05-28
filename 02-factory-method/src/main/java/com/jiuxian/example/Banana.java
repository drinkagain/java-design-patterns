package com.jiuxian.example;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:52:00
 * Comment:
 */


public class Banana implements Fruit {

    @Override
    public void getName() {
        System.out.println("我是香蕉。。。");
    }

    @Override
    public void taste() {
        System.out.println("我尝起来又香又甜...");
    }
}
