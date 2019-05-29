package com.jiuxian.definition;

import java.util.Arrays;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:19:00
 * *
 * @description:
 **/
public class ConcreteAggregate<T> implements Aggregate<T> {

    private Object[] elementData = new Object[2];

    private int size = 0;

    @Override
    public void add(T o) {
        if (size > elementData.length - 1) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
        elementData[size++] = o;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator(elementData);
    }
}
