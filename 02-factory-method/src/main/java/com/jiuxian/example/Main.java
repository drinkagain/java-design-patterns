package com.jiuxian.example;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:56:00
 * Comment:
 */


public class Main {

    public static void main(String[] args) {
        AbstractFruitsFactory factory = new FruitsFactory();

        Apple apple = factory.createFruit(Apple.class);
        apple.getName();
        apple.taste();

        Banana banana = factory.createFruit(Banana.class);
        banana.getName();
        banana.taste();
    }
}
