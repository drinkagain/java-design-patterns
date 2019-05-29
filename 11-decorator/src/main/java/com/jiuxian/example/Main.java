package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:36:10
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        SchoolReport report = new ForthGradeSchoolReport();

        report = new HighScoreDecorator(report);

        report = new SortDecorator(report);

        report.report();
        report.sign("张三");
    }
}
