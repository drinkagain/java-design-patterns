package com.jiuxian.example2;

import com.jiuxian.example1.inner.IUserInfo;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:07:57
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        //传递三个对象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
