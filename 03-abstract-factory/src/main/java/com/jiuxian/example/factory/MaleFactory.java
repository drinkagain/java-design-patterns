package com.jiuxian.example.factory;

import com.jiuxian.example.product.Human;
import com.jiuxian.example.product.MaleChineseHuman;
import com.jiuxian.example.product.MaleEnglishHuman;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:02:56
 * *
 * @description: 男性工厂类
 **/
public class MaleFactory implements HumanFactory {

    @Override
    public Human createChineseHuman() {
        return new MaleChineseHuman();
    }

    @Override
    public Human createEnglishHuman() {
        return new MaleEnglishHuman();
    }
}
