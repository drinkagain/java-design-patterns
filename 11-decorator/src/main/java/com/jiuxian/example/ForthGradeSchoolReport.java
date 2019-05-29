package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:37:33
 * *
 * @description: 四年级成绩单
 **/
public class ForthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println("家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为： " + name);
    }
}
