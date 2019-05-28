package com.jiuxian.example;

import com.jiuxian.example.template.HummerModel;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:00:09
 * *
 * @description: H1 悍马
 **/
public class HummerH1Model extends HummerModel {


    @Override
    protected void start() {
        System.out.println("悍马H1启动了。。。");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止了。。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1开始鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1发动机声音是这样的。。。。");
    }
}
