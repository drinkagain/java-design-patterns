package com.jiuxian.example1.inner;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:37:00
 * *
 * @description: 员工信息接口
 **/
public interface IUserInfo {
    //获得用户姓名
    String getUserName();

    //获得家庭地址
    String getHomeAddress();

    //手机号码， 这个太重要， 手机泛滥呀
    String getMobileNumber();

    //办公电话， 一般是座机
    String getOfficeTelNumber();

    //这个人的职位是什么
    String getJobPosition();

    //获得家庭电话， 这有点不好， 我不喜欢打家庭电话讨论工作
    String getHomeTelNumber();
}
