package com.jiuxian.example;

/**
 * Author: liuzejun
 * Date: 2019-05-28 10:53:00
 * Comment: 水果工厂类
 */

public class FruitsFactory extends AbstractFruitsFactory {

    @Override
    public <T extends Fruit> T createFruit(Class<T> clazz) {
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("水果生成有误!");
        }
    }
}
