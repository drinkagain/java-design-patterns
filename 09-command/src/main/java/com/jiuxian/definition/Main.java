package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:56:18
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Receiver receiver = new ConcreteReceiver1();

        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);

        invoker.action();
    }
}
