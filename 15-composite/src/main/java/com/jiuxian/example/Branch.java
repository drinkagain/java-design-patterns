package com.jiuxian.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:52:21
 * *
 * @description: 分支的节点实现
 **/
public class Branch extends Corp {
    //存储子节点的信息
    private List<Corp> subordinateList = new ArrayList<>();

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    public void addSubordinate(Corp corp) {
        super.setParent(this);//设置父节点

        this.subordinateList.add(corp);
    }

    //获得下级的信息
    public List<Corp> getSubordinateInfo() {
        return this.subordinateList;
    }
}