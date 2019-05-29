package com.jiuxian.example1.out;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:40:06
 * *
 * @description: 劳动服务公司的人员实现
 **/
public class OuterUser implements IOuterUser {
    /**
     * 用户的基本信息
     */
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }

    /**
     * 员工的家庭信息
     */

    public Map<String, String> getUserHomeInfo() {
        Map<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }

    /**
     * 员工的工作信息， 比如， 职位等
     */
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
