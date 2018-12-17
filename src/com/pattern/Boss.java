package com.pattern;

/**
 * 访问者：老板
 */
public class Boss implements Visitor{
    private Double totalConsumeMoney = 0d;//消费总金额
    private Double totalIncomeMoney = 0d;//收入总金额
    @Override
    public void visitor(ConsumeBill consumeBill) {
        totalConsumeMoney += consumeBill.getMoney();
    }

    @Override
    public void visitor(IncomeBill incomeBill) {
        totalIncomeMoney += incomeBill.getMoney();
    }

    public void display(){
        System.out.println("总收入："+this.totalIncomeMoney+",总消费："+this.totalConsumeMoney);
    }
}
