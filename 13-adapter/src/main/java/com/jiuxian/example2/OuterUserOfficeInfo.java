package com.jiuxian.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:59:53
 * *
 * @description: 用户工作信息
 **/
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    /*
     * 员工的工作信息， 比如， 职位等
     */
    public Map getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }
}
