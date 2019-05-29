package com.jiuxian.definition;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 11:36:10
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        Composite root = new Composite();
        root.doSth();

        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        root.add(leaf);

        display(root);
    }

    //通过递归遍历树
    private static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) { //叶子节点
                c.doSth();
            } else { //树枝节点
                display((Composite) c);
            }
        }
    }
}
