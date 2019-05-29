package com.jiuxian.definition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 15:50:42
 * *
 * @description: 树枝构件
 **/
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public List<Component> getChildren() {
        return this.components;
    }
}
