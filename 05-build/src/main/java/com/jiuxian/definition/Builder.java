package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:11:09
 * *
 * @description: 抽象建造者
 **/
public abstract class Builder {

    //设置产品的不同部分，获取不同的产品
    public abstract void setPart();

    //建造产品
    public abstract Product buildProduct();
}
