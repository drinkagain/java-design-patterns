package com.jiuxian.example.factory;

import com.jiuxian.example.product.Human;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:00:52
 * *
 * @description: 工厂类
 **/
public interface HumanFactory {

    Human createChineseHuman();

    Human createEnglishHuman();
}
