package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 14:14:39
 * *
 * @description: 环境角色1
 **/
public class ConcreteState1 extends State {

    @Override
    public void handle1() {
        System.out.println("ConcreteState1 handle1");
    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
