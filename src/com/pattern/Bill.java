package com.pattern;

/**
 * element :元素接口
 */
public interface Bill {
    void accept(Visitor visitor);
}
