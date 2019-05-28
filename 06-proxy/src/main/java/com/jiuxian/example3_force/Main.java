package com.jiuxian.example3_force;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 12:57:26
 * *
 * @description: 强制代理 场景类
 **/
public class Main {

    @Test
    public void notUseProxy() {
        IGamePlayer proxy = new GamePlayer("张三");
        System.out.println("开始时间：" + LocalDateTime.now());
        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间:" + LocalDateTime.now());
    }

    @Test
    public void useProxy() {
        IGamePlayer proxy = new GamePlayer("张三").getProxy();

        System.out.println("开始时间：" + LocalDateTime.now());
        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间:" + LocalDateTime.now());
    }
}
