package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:24:07
 * *
 * @description: 奔驰模型
 **/
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰启动了。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停止了。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰开始鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰的引擎是这样的。。。。");
    }

}
