package com.pattern;

/**
 * 消费情况
 */
public class ConsumeBill implements Bill{
    private Double money;//消费金额
    private String type;//消费类型
    public ConsumeBill(Double money,String type){
        this.money = money;
        this.type = type;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public Double getMoney() {
        return money;
    }

    public String getType() {
        return type;
    }

}
