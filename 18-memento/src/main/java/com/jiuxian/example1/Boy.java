package com.jiuxian.example1;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-30 11:54:17
 * *
 * @description: 主题
 **/
public class Boy {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void changeState() {
        this.setState("心情可能很不好");
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
