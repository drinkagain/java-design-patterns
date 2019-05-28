package com.jiuxian;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:35:00
 * Comment:
 */


public class Singleton2 {

    private static Singleton2 INSTANCE;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
