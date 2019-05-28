package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:51:40
 * *
 * @description: 真实主题类
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题类request");
    }
}
