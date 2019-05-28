package com.jiuxian.example;

import com.jiuxian.example.command.impl.AddRequirementCommand;
import com.jiuxian.example.command.impl.ChangeRequirementCommand;
import com.jiuxian.example.invoker.Invoker;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 16:04:35
 * *
 * @description: 场景类
 **/
public class Main {


    public static void main(String[] args) {

        System.out.println("------Add 命令-----");
        Invoker invoker = new Invoker();
        invoker.setCommand(new AddRequirementCommand());
        invoker.action();

        System.out.println("------change 命令-----");
        invoker.setCommand(new ChangeRequirementCommand());
        invoker.action();


    }
}
