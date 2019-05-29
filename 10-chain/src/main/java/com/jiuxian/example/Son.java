package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:24:05
 * *
 * @description: 儿子类
 **/
public class Son extends Handler {

    public Son() {
        super(SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n--------母亲向儿子请求------");
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
