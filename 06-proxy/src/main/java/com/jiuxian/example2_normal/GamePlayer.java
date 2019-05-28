package com.jiuxian.example2_normal;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 14:01:03
 * *
 * @description:
 **/
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer _gamePlayer, String name) {
        if (_gamePlayer == null) {
            throw new RuntimeException("不能创建真实角色!");
        }
        this.name = name;
    }

    @Override
    public void login(String account, String password) {
        System.out.println("玩家:" + account + " 登录成功!");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " 在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 升级了！");
    }
}
