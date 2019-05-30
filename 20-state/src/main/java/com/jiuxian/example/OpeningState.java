package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 14:32:37
 * *
 * @description: 敞门状态
 **/
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);

        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //do nothing;
    }

    @Override
    public void stop() {
        //do nothing;
    }
}
