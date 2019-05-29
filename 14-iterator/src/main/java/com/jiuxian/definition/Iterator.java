package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:13:45
 * *
 * @description: 抽象迭代器
 **/
public interface Iterator<T> {

    T next();

    boolean hasNext();
}
