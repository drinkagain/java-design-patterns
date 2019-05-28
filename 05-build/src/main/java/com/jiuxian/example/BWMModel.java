package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:25:28
 * *
 * @description: 宝马模型代码
 **/
public class BWMModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马启动了。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止了。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马开始鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马的引擎是这样的。。。。");
    }
}
