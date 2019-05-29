package com.jiuxian.example1.inner;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:37:54
 * *
 * @description: 实现类
 **/
public class UserInfo implements IUserInfo {

    /**
     * 获得家庭地址， 下属送礼也可以找到地方
     */
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    /**
     * 获得家庭电话号码
     */
    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是...");
        return null;
    }

    /**
     * 员工的职位，是部门经理还是普通职员
     */

    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS...");
        return null;
    }

    /**
     * 手机号码
     */
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是0000...");
        return null;
    }

    /**
     * 办公室电话，烦躁的时候最好"不小心"把电话线踢掉
     */
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是...");
        return null;
    }

    /**
     * 姓名，这个很重要
     */
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }
}
