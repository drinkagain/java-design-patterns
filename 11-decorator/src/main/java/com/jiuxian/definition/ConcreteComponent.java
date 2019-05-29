package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:21:18
 * *
 * @description: 具体构件
 **/
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do sth.");
    }
}
