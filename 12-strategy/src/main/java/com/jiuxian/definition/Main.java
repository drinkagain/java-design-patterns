package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:36:10
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();

        //声明上下文对象
        Context context = new Context(strategy);

        //执行封装后的方法
        context.doAnyThing();
    }
}
