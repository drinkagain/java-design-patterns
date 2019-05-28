package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 16:04:35
 * *
 * @description: 场景类
 **/
public class Main {


    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("-----采购人员采购电脑-----");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("-----销售人员销售电脑------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(399);

        System.out.println("-----库房管理人员清理库存------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
