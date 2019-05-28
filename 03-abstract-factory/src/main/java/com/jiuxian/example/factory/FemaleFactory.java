package com.jiuxian.example.factory;

import com.jiuxian.example.product.FemaleChineseHuman;
import com.jiuxian.example.product.FemaleEnglishHuman;
import com.jiuxian.example.product.Human;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:01:56
 * *
 * @description: 女性工厂类
 **/

public class FemaleFactory implements HumanFactory {

    @Override
    public Human createChineseHuman() {
        return new FemaleChineseHuman();
    }

    @Override
    public Human createEnglishHuman() {
        return new FemaleEnglishHuman();
    }
}
