package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 15:46:56
 * *
 * @description: 库存管理
 **/
public class Stock extends AbstractColleague {

    private static int COMPUTER_COUNT = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        COMPUTER_COUNT += number;
        System.out.println("库存数量为：" + COMPUTER_COUNT);
    }

    public void decrease(int number) {
        COMPUTER_COUNT = COMPUTER_COUNT - number;
        System.out.println("库存数量为：" + COMPUTER_COUNT);
    }

    public int getStockNumber() {
        return COMPUTER_COUNT;
    }

    public void clearStock() {
        System.out.println("清理存货数量为：" + COMPUTER_COUNT);
        super.mediator.execute("stock.clear");
    }
}


