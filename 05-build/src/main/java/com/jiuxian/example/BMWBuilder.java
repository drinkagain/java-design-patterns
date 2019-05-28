package com.jiuxian.example;

import java.util.List;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 13:33:39
 * *
 * @description: 宝马车组装者
 **/
public class BMWBuilder extends CarBuilder {
    private BWMModel bwmModel = new BWMModel();

    @Override
    public void setSequence(List<String> sequence) {
        bwmModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bwmModel;
    }
}
