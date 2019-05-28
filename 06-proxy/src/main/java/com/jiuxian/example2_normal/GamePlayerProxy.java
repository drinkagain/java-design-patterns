package com.jiuxian.example2_normal;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 14:05:10
 * *
 * @description: 游戏 代理类
 **/
public class GamePlayerProxy implements IGamePlayer {

    public IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        this.gamePlayer = new GamePlayer(this, name);
    }

    @Override
    public void login(String account, String password) {
        gamePlayer.login(account, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
