package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 13:22:34
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //获得元素对象
            Element el = ObjectStruture.createElement();
            //接受访问者访问
            el.accept(new Visitor());
        }
    }
}
