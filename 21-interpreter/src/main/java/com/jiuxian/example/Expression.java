package com.jiuxian.example;

import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:16:05
 * *
 * @description: 抽象表达式类
 **/
public abstract class Expression {

    public abstract int interpreter(Map<String, Integer> var);
}
