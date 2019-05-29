package com.jiuxian.example1;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:03:19
 * *
 * @description: 吴国太开绿灯
 **/
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！ ");
    }
}
