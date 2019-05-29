package com.jiuxian.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:58:49
 * *
 * @description: 用户家庭信息
 **/
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    /*
     * 员工的家庭信息
     */
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;
    }
}
