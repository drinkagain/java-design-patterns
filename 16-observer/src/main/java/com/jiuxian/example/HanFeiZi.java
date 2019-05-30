package com.jiuxian.example;

import java.util.Observable;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:29:07
 * *
 * @description: 具体的被观察者
 **/
public class HanFeiZi extends Observable implements IHanFeiZi {

    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    //韩非子开始娱乐了
    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
