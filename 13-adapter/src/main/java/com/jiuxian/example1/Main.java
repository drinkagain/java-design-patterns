package com.jiuxian.example1;

import com.jiuxian.example1.inner.IUserInfo;
import com.jiuxian.example1.inner.UserInfo;
import org.junit.Test;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:00:48
 * *
 * @description: 场景类
 **/
public class Main {

    @Test
    public void test1() {
        //没有与外系统连接的时候， 是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }

    @Test
    public void test2() {
        //老板一想不对呀， 兔子不吃窝边草， 还是找借用人员好点
        //我们只修改了这句话
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }

}
