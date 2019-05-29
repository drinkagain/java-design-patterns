package com.jiuxian.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:08:28
 * *
 * @description: 策略枚举
 **/
public enum Calculator {

    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String value;

    Calculator(String value) {
        this.value = value;
    }

    private static Map<String, Calculator> map = new HashMap<>();

    static {
        Stream.of(values()).forEach(s -> map.put(s.value, s));
    }

    public static Calculator getInstance(String value) {
        if (!map.containsKey(value)) {
            throw new RuntimeException("参数不合法");
        }
        return map.get(value);
    }


    public abstract int exec(int a, int b);
}
