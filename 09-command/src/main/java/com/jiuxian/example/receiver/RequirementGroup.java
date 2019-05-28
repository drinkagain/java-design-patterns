package com.jiuxian.example.receiver;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 16:57:29
 * *
 * @description: 需求组
 **/
public class RequirementGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("客户需要增加一项需求。。。");
    }

    @Override
    public void change() {
        System.out.println("客户需要改一项需求。。。");
    }

    @Override
    public void plan() {
        System.out.println("客户需要计划。。。");
    }
}
