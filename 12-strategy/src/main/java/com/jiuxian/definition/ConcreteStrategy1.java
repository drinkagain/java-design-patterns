package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 13:37:53
 * *
 * @description: 具体策略角色1
 **/
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void doSth() {
        System.out.println("具体策略1");
    }
}
