package com.jiuxian.example4_dynamic;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 14:37:50
 * *
 * @description: 场景类
 **/
public class Main {

    @Test
    public void test1() {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);

        System.out.println("开始时间：" + LocalDateTime.now());
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),
                gamePlayer.getClass().getInterfaces(), gamePlayerProxy);

        proxy.login("zhangsan", "233");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间:" + LocalDateTime.now());
    }
}
