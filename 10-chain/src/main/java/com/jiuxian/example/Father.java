package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:22:25
 * *
 * @description: 父亲类
 **/
public class Father extends Handler {

    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n--------女儿向父亲请求------");
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是：同意");
    }

}
