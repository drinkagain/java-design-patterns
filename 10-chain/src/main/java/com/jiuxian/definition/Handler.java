package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:02:10
 * *
 * @description: 抽象处理类
 **/
public abstract class Handler {

    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者，业务自行处理
            }
        }
        return response;
    }


    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }


    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
