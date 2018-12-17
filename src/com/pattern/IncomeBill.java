package com.pattern;

/**
 * 收入情况
 */
public class IncomeBill implements Bill{
    private Double money;//收入金额
    private String type;//收入类型
    public IncomeBill(Double money,String type){
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
