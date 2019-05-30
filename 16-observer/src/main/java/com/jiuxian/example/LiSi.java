package com.jiuxian.example;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:30:48
 * *
 * @description: 具体的观察者
 **/
public class LiSi implements Observer {
    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯： 报告， 秦老板！ 韩非子有活动了--->" + reportContext);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯： 观察到韩非子活动， 开始向老板汇报了...");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯： 汇报完毕...\n");
    }
}
