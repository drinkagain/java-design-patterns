package com.jiuxian.example.receiver;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 16:59:26
 * *
 * @description: 美工组
 **/
public class PageGroup extends Group {


    @Override
    public void find() {
        System.out.println("找美工组。。。");
    }

    @Override
    public void add() {
        System.out.println("客户需要加一个页面。。。");
    }

    @Override
    public void change() {
        System.out.println("客户需要改一个页面。。。");
    }

    @Override
    public void plan() {
        System.out.println("客户需要计划。。。");
    }
}
