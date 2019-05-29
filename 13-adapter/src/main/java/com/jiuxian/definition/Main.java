package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:36:10
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        //增加的适配器角色后业务逻辑
        Target target2 = new Adapter();
        target2.request();

    }
}
