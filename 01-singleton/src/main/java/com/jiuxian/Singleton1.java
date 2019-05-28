package com.jiuxian;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:35:00
 * Comment:
 */


public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

}
