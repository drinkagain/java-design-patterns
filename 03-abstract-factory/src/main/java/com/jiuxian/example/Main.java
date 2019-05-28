package com.jiuxian.example;

import com.jiuxian.example.factory.FemaleFactory;
import com.jiuxian.example.factory.HumanFactory;
import com.jiuxian.example.factory.MaleFactory;
import com.jiuxian.example.product.Human;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:00:10
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        Human maleChineseHuman = maleFactory.createChineseHuman();
        maleChineseHuman.getSex();
        maleChineseHuman.language();

        Human femaleChineseHuman = femaleFactory.createChineseHuman();
        femaleChineseHuman.getSex();
        femaleChineseHuman.language();

        Human maleEnglishHuman = maleFactory.createEnglishHuman();
        maleEnglishHuman.getSex();
        maleEnglishHuman.language();

        Human femaleEnglishHuman = femaleFactory.createEnglishHuman();
        femaleEnglishHuman.getSex();
        femaleEnglishHuman.language();


    }
}
