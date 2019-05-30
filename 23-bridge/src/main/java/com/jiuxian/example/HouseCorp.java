package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 16:43:03
 * *
 * @description: 房地产公司
 **/
public class HouseCorp extends Corp {


    public HouseCorp(Product product) {
        super(product);
    }

    //房地产公司很High了， 赚钱， 计算利润
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
