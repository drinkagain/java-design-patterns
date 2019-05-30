package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 11:00:46
 * *
 * @description: 门面对象
 **/
public class Facade {

    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void methodA() {
        a.doSth();
    }

    public void methodB() {
        b.doSth();
    }

    public void methodC() {
        c.doSth();
    }
}
