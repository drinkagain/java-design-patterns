package com.jiuxian.example;

import com.jiuxian.example.template.HummerModel;

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
        System.out.println("----------------悍马 H1-----------------");
        HummerModel h1 = new HummerH1Model();
        h1.run();

        System.out.println("----------------悍马 H2-----------------");
        HummerModel h2 = new HummerH2Model();
        h2.run();

        System.out.println("----------------悍马 H3-----------------");
        HummerH3Model h3 = new HummerH3Model();
//        h3.setAlerm(false);
        h3.setAlerm(true);
        h3.run();
    }
}
