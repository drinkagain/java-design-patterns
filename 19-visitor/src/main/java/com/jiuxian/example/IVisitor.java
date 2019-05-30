package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:46:39
 * *
 * @description: 访问者接口
 **/
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

    int getTotalSalary();

}
