package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:08:17
 * *
 * @description: 具体处理者1
 **/
public class ConcreteHandler1 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return Level.ONE;
    }

    @Override
    protected Response echo(Request request) {
        return new Response("我是 handler1");
    }
}
