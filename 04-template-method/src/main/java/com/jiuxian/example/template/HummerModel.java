package com.jiuxian.example.template;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:57:59
 * *
 * @description: 模板方法
 **/
public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected boolean isAlarm() {
        return true;
    }

    public final void run() {
        this.start();

        this.engineBoom();

        if (isAlarm()) {
            this.alarm();
        }

        this.stop();
    }
}
