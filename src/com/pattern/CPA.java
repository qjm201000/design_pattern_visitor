package com.pattern;

/**
 * 访问者：会计访问，做操作
 */
public class CPA implements Visitor{
    @Override
    public void visitor(ConsumeBill consumeBill) {
        if(consumeBill.getType().equalsIgnoreCase("工资")){//公司消费工资，也是要给税的
            System.out.println("发工资"+consumeBill.getMoney()+"元，交税");
        }
    }

    @Override
    public void visitor(IncomeBill incomeBill) {
        //会计做账，每一笔收入要给税
        System.out.println(incomeBill.getType()+",收入金额："+incomeBill.getMoney()+"元，"+"交税");
    }
}
