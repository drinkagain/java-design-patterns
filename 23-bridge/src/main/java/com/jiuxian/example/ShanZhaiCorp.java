package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 16:49:23
 * *
 * @description: 山寨公司
 **/
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    //狂赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
