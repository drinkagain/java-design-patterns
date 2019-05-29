package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:18:05
 * *
 * @description: 抽象容器
 **/
public interface Aggregate<T> {
    void add(T t);

    Iterator<T> iterator();
}
