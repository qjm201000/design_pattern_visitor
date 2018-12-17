package com.pattern;

public class Main {
    public static void main(String[] args) {
        //添加消费记录
        ConsumeBill consumeBillCloth = new ConsumeBill(23.24,"进购打印机");
        ConsumeBill consumeBillShoes = new ConsumeBill(212.99,"进购桌子");
        ConsumeBill consumeBillSalary = new ConsumeBill(3000.00,"工资");
        IncomeBill incomeBillAlipay = new IncomeBill(300.66,"卖维护");
        IncomeBill incomeBillWechat = new IncomeBill(123.88,"卖软件");

        //帐蒲
        AccountBook accountBook = new AccountBook();
        accountBook.add(consumeBillCloth);
        accountBook.add(consumeBillShoes);
        accountBook.add(consumeBillSalary);
        accountBook.add(incomeBillAlipay);
        accountBook.add(incomeBillWechat);

        //老板过来访问
        Boss boss = new Boss();
        accountBook.show(boss);
        boss.display();
        System.out.println("-------------------");

        //会计过来访问
        CPA cpa = new CPA();
        accountBook.show(cpa);
    }
}
