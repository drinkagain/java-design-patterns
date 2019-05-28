package com.jiuxian.example2_normal;

import java.time.LocalDateTime;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:57:26
 * *
 * @description: 普通代理 场景类
 **/
public class Main {

    public static void main(String[] args) {

        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println("开始时间：" + LocalDateTime.now());
        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间:" + LocalDateTime.now());

    }
}
