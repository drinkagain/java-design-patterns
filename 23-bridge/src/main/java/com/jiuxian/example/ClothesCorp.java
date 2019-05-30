package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 16:43:57
 * *
 * @description: 服装公司
 **/
public class ClothesCorp extends Corp {

    public ClothesCorp(Product product) {
        super(product);
    }

    //服装公司不景气， 但怎么说也是赚钱行业
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
