package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:36:32
 * *
 * @description: 抽象成绩单
 **/
public abstract class SchoolReport {

    //成绩
    public abstract void report();

    //家长签字
    public abstract void sign(String name);
}
