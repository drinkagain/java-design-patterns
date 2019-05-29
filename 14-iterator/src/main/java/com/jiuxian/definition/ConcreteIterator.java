package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:14:37
 * *
 * @description: 具体迭代器
 **/
public class ConcreteIterator<T> implements Iterator<T> {

    private T[] element;

    private int cursor = 0;

    public ConcreteIterator(T[] ts) {
        this.element = ts;
    }

    @Override
    public T next() {
        return this.element[cursor++];
    }

    @Override
    public boolean hasNext() {
        return (cursor != this.element.length) && (this.element[cursor] != null);
    }
}
