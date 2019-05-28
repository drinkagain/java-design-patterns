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
        //通过clone 创建的对象不会执行构造方法。
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass clone = prototypeClass.clone();
        System.out.println(clone == prototypeClass);
    }
}
