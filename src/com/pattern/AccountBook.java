package com.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构： 帐簿
 */
public class AccountBook {
    private List<Bill> list = new ArrayList<Bill>();

    /**
     * 添加流水
     * @param bill
     */
    public void add(Bill bill){
        list.add(bill);
    }

    /**
     * 供账本的查看者查看账本
     * @param visitor
     */
    public void show(Visitor visitor){
        for(Bill bill:list){
            bill.accept(visitor);
        }
    }
}
