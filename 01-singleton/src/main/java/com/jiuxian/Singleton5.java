package com.jiuxian;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:35:00
 * Comment:
 */


public class Singleton5 {

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private Singleton5 singleton;

        Singleton() {
            singleton = new Singleton5();
        }

        public Singleton5 getInstance() {
            return singleton;
        }
    }

}
