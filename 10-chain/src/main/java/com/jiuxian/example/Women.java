package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 10:19:40
 * *
 * @description: 古代女性
 **/
public class Women implements IWomen {
    /**
     * 1 未出嫁
     * 2 出嫁
     * 3 夫死
     */
    private int type;

    private String request;

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
