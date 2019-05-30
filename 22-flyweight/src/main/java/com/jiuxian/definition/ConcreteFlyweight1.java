package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:55:10
 * *
 * @description: 具体享元角色1
 **/
public class ConcreteFlyweight1 extends Flyweight {

    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteFlyweight1 operate do sth.");
    }
}
