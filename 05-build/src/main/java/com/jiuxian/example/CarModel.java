package com.jiuxian.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:20:22
 * *
 * @description: 车辆模型抽象类
 **/
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (String actionName : sequence) {
            if (actionName.equals("start")) {
                this.start();
            } else if (actionName.equals("stop")) {
                this.stop();
            } else if (actionName.equals("alarm")) {
                this.alarm();
            } else if (actionName.equals("engineBoom")) {
                this.engineBoom();
            }
        }
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
