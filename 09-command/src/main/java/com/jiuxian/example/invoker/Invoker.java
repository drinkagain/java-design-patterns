package com.jiuxian.example.invoker;

import com.jiuxian.example.command.Command;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 17:02:06
 * *
 * @description: 调用者invoker 类
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }

}
