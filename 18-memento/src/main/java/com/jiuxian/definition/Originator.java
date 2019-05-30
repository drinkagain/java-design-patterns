package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 11:42:33
 * *
 * @description: 发起人
 **/
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setMemento(Memento memento) {
        this.setState(memento.getState());
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    //恢复一个备忘录
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }
}
