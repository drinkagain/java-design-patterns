package com.jiuxian.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:23:49
 * *
 * @description: 场景类
 **/
public class Main {

    //运行四则运算
    public static void main(String[] args) {
        String expStr = "a+b+c";

        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("a", 20);
            put("b", 10);
            put("c", 60);
        }};

        Calculator calculator = new Calculator(expStr);
        int result = calculator.run(map);
        System.out.println(result);

    }
}