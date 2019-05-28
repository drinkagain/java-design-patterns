package com.jiuxian.example.receiver;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 17:00:33
 * *
 * @description: 代码组
 **/
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组。。。");
    }

    @Override
    public void add() {
        System.out.println("客户需要加一项功能。。。");
    }

    @Override
    public void change() {
        System.out.println("客户需要改一项功能 。。。");
    }

    @Override
    public void plan() {
        System.out.println("客户需要计划。。。");
    }
}
