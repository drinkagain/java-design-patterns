package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:56:18
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        Response response = handler1.handleMessage(new Request(Level.TWO));
        System.out.println(response);
    }
}
