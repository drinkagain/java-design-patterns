package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:52:13
 * *
 * @description: 代理类
 **/
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        if (this.before()) {
            this.subject.request();
            this.after();
        }
    }

    protected boolean before() {
        System.out.println("之前执行。。。");
        return true;
    }

    protected void after() {
        System.out.println("之后执行");
    }
}
