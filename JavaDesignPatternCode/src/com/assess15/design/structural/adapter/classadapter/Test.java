package com.assess15.design.structural.adapter.classadapter;

/**
 * 类适配器
 */
public class Test {
    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
