package com.jiuxian.example;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:40:58
 * *
 * @description:
 **/
public class WangSi implements Observer {

    //一看韩非子有活动，他就痛哭
    private void cry(String context) {
        System.out.println("王斯： 因为" + context + "， --所以我悲伤呀！ ");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯： 观察到韩非子活动， 自己也开始活动了...");
        this.cry(arg.toString());
        System.out.println("王斯： 哭死了...\n");
    }
}
