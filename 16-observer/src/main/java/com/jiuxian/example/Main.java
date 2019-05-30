package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 10:32:25
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(new LiSi());
        hanFeiZi.addObserver(new WangSi());

        hanFeiZi.haveBreakfast();

        hanFeiZi.haveFun();
    }
}