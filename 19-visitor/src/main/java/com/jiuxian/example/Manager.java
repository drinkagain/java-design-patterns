package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:44:28
 * *
 * @description: 管理阶层
 **/
public class Manager extends Employee {

    //这类人物的职责非常明确： 业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    protected String getOtherInfo() {
        return "业绩： " + this.performance + "\t";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
