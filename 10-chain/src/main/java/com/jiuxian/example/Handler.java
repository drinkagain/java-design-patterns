package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:33:51
 * *
 * @description: 抽象处理类
 **/
public abstract class Handler implements IHandler {

    final static int FATHER_LEVEL_REQUEST = 1;
    final static int HUSBAND_LEVEL_REQUEST = 2;
    final static int SON_LEVEL_REQUEST = 3;

    private int level;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("\n--------------------------");
                System.out.println("无处请示，自行处理");
            }
        }
    }

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IWomen women);
}
