package com.jiuxian.example;

import java.util.Map;
import java.util.Stack;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:21:47
 * *
 * @description: 解析封装器
 **/
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {

        //定义一个栈， 安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left;
        Expression right;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //加法
                    //加法结果放到栈中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default: //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    //开始运算
    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}