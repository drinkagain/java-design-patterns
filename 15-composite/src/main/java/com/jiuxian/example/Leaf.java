package com.jiuxian.example;

public class Leaf extends Corp {
    //叶子叫什么名字
    private String name = "";
    //叶子的职位
    private String position = "";
    //叶子的薪水
    private int salary = 0;

    public Leaf(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }
}