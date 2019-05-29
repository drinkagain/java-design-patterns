package com.jiuxian.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:58:04
 * *
 * @description: 用户基本信息
 **/
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    /**
     * 用户的基本信息
     */
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }
}
