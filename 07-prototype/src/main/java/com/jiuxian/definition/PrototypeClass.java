package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 15:00:37
 * *
 * @description: 原型模式通用源码
 **/
public class PrototypeClass implements Cloneable {

    public PrototypeClass() {
        System.out.println("init ...");
    }

    @Override
    protected PrototypeClass clone() {
        try {
            return (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return null;
    }
}
