package com.jiuxian.example1;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-29 14:00:48
 * *
 * @description: 场景类
 **/
public class Main {

    public static void main(String[] args) {

        //刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        Context context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        System.out.println();

        //刘备乐不思蜀了， 拆第二个了
        System.out.println("---刘备乐不思蜀了， 拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate(); //执行了第二个锦囊
        System.out.println();

        //孙权的小兵追来了， 咋办？ 拆第三个
        System.out.println("---孙权的小兵追来了， 咋办？ 拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
    }
}
