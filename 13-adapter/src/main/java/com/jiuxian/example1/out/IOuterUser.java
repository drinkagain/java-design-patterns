package com.jiuxian.example1.out;

import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:39:11
 * *
 * @description: 劳动服务公司的人员信息接口
 **/
public interface IOuterUser {

    //基本信息， 比如名称、 性别、 手机号码等
    Map<String, String> getUserBaseInfo();

    //工作区域信息
    Map<String, String> getUserOfficeInfo();

    //用户的家庭信息
    Map<String, String> getUserHomeInfo();
}
