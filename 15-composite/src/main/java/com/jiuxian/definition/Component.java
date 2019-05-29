package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:49:21
 * *
 * @description: 抽象构件
 **/
public abstract class Component {

    //个体和主体都具有的共享
    public void doSth() {
        //业务逻辑
        System.out.println("Component  doSth");
    }
}
