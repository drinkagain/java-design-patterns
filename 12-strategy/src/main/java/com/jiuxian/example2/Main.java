package com.jiuxian.example2;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:07:57
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        int a = 1;
        String symbol = "-";
        int b = 2;
        System.out.println(a + symbol + b + " = " + Calculator.getInstance(symbol).exec(a, b));
    }
}
