package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:33:04
 * *
 * @description: 适配器角色
 **/
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSth();
    }
}
