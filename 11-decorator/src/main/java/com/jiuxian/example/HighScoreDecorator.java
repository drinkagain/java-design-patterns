package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:44:48
 * *
 * @description: 最高成绩装饰类
 **/
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //首先要定义你要美化的方法， 先给老爸说学校最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75， 数学是78， 自然是80");
    }


    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
