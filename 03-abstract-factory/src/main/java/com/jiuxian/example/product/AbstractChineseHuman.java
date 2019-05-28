package com.jiuxian.example.product;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 11:54:02
 * *
 * @description: 中国人
 **/
public abstract class AbstractChineseHuman implements Human {

    @Override
    public void language() {
        System.out.println("我是中国人，我说汉语。。。");
    }
}
