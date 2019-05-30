package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 14:14:39
 * *
 * @description: 环境角色2
 **/
public class ConcreteState2 extends State {

    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle2();
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState2 handle2");
    }
}
