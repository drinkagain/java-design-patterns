package com.jiuxian.definition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:56:05
 * *
 * @description: 享元工厂
 **/
public class FlyweightFactory {

    private static Map<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        if (pool.containsKey(extrinsic)) return pool.get(extrinsic);

        Flyweight flyweight = new ConcreteFlyweight1(extrinsic);
        pool.put(extrinsic, flyweight);
        return flyweight;
    }
}
