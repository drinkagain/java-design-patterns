package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:08:17
 * *
 * @description: 具体处理者3
 **/
public class ConcreteHandler3 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return Level.THREE;
    }

    @Override
    protected Response echo(Request request) {
        return new Response("我是 handler3");
    }
}
