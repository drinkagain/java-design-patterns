package com.jiuxian.example4_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 14:35:54
 * *
 * @description: 动态代理类
 **/
public class GamePlayerProxy implements InvocationHandler {

    //被代理者
    private Class clazz;

    //被代理的示例
    private Object obj;

    public GamePlayerProxy(Object obj) {
        this.obj = obj;
        clazz = obj.getClass();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj, args);
    }
}
