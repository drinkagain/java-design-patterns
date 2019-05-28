package com.jiuxian.example.product;

import com.jiuxian.example.product.AbstractChineseHuman;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 11:57:00
 * *
 * @description: 中国男人
 **/
public class MaleChineseHuman extends AbstractChineseHuman {

    @Override
    public void getSex() {
        System.out.println("我是中国男人...");
    }
}
