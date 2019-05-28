package com.jiuxian.example1_sample;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 14:00:14
 * *
 * @description: 游戏者接口
 **/
public interface IGamePlayer {

    void login(String account, String password);

    void killBoss();

    void upgrade();
}
