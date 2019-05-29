package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:32:04
 * *
 * @description: 目标角色具体实现
 **/
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("ConcreteTarget request");
    }
}
