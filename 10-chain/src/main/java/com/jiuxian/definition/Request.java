package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:03:57
 * *
 * @description: 请求
 **/
public class Request {

    private Level level;

    public Request(Level level) {
        this.level = level;
    }

    public Level getRequestLevel() {
        return level;
    }

}
