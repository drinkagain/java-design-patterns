package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 14:18:06
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        context.setCurrentState(new ConcreteState1());

        context.handle1();
        context.handle2();
    }
}
