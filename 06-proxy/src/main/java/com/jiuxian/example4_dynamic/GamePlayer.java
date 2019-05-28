package com.jiuxian.example4_dynamic;

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

    public GamePlayer(String name) {
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
