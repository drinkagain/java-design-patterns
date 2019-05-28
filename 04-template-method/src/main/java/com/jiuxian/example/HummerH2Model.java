package com.jiuxian.example;

import com.jiuxian.example.template.HummerModel;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:00:09
 * *
 * @description: H2 悍马
 **/
public class HummerH2Model extends HummerModel {


    @Override
    protected void start() {
        System.out.println("悍马H2启动了。。。");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止了。。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2开始鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2发动机声音是这样的。。。。");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
