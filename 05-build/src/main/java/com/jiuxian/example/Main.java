package com.jiuxian.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:57:26
 * *
 * @description: 场景类
 **/
public class Main {
    public static void main(String[] args) {

        List<String> sequence = new ArrayList<String>() {{
            add("start");
            add("engineBoom");
            add("alarm");
            add("stop");
        }};

        System.out.println("----------奔驰模型--------------");
        CarBuilder banzBuilder = new BanzBuilder();
        banzBuilder.setSequence(sequence);
        CarModel banzModel = banzBuilder.getCarModel();
        banzModel.run();


        System.out.println("----------宝马模型--------------");
        CarBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel bmwModel = bmwBuilder.getCarModel();
        bmwModel.run();
    }
}
