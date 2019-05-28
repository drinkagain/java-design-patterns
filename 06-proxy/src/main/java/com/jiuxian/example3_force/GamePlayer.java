package com.jiuxian.example3_force;

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

    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    @Override
    public void login(String account, String password) {
        if (this.isProxy()) {
            System.out.println("玩家:" + account + " 登录成功!");
        } else {
            System.out.println("请使用代理访问");
        }

    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + " 在打怪！");
        } else {
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 升级了！");
        } else {
            System.out.println("请使用代理访问");
        }
    }

    private boolean isProxy() {
        return this.proxy != null;
    }
}
