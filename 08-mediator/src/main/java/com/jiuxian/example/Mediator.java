package com.jiuxian.example;

/**
 * @author: liuzejun
 * *
 * @email: 857591294@qq.com
 * *
 * @date: 2019-05-28 15:54:05
 * *
 * @description: 具体中介者
 **/
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {

            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {

            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {

            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int salesStatus = super.sale.getSalesStatus();
        if (salesStatus > 60) {
            System.out.println("采购IBM电脑：" + number + " 台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑：" + buyNumber + " 台");
            super.stock.increase(buyNumber);
        }
    }

    private void sellComputer(int number) {
        //库存数量不足
        while (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑：" + stock.getStockNumber() + " 台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}
