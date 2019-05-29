package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:23:15
 * *
 * @description: 丈夫类
 **/
public class Husband extends Handler {

    public Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n--------妻子向丈夫请求------");
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
