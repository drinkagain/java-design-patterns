package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:08:00
 * *
 * @description: 抽象表达式
 **/
public abstract class Expression {
    //每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
