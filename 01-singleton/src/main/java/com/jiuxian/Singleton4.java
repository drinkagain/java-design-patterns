package com.jiuxian;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:35:00
 * Comment:
 */


public class Singleton4 {

    private Singleton4() {
    }

    private static class SingletonInstance {
        private final static Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
