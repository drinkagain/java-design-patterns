package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 15:09:22
 * *
 * @description: 非终结符表达式
 **/
public class NonterminalExpression extends Expression {

    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expressions) {
    }

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
