package com.pattern;

/**
 * 访问者
 */
public interface Visitor {
    void visitor(ConsumeBill consumeBill);//消费情况
    void visitor(IncomeBill incomeBill);//收入情况
}
