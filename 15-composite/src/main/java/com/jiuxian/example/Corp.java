package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 16:22:59
 * *
 * @description: 抽象公司职员类
 **/
public abstract class Corp {

    //公司每个人都有名称
    private String name;
    //公司每个人都职位
    private String position;
    //公司每个人都有薪水
    private int salary;

    private Corp parent;

    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    //获得员工信息
    public String getInfo() {
        String info = "";
        info = "姓名： " + this.name;
        info = info + "\t职位： " + this.position;
        info = info + "\t薪水： " + this.salary;
        return info;
    }

    protected void setParent(Corp parent) {
        this.parent = parent;
    }

    public Corp getParent() {
        return parent;
    }
}
