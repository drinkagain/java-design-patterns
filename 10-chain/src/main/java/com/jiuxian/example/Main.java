package com.jiuxian.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 16:04:35
 * *
 * @description: 场景类  三从四德   未嫁从父、 既嫁从夫、 夫死从子
 **/
public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        List<IWomen> womenList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            womenList.add(new Women(random.nextInt(4), "要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : womenList) {
            father.handleMessage(women);
        }

    }
}
