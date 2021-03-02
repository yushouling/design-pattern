package com.ysl.design.bridge.design.template.way1.impl;

import com.ysl.design.bridge.design.template.way1.AbstractFactory;

public class Bus extends AbstractFactory {
    String brand = "生产公交车型号的";

    @Override
    protected void createCarEngineer() {
        System.out.println(brand + "B1发动机");
    }

    @Override
    protected void createCarFrame() {
        System.out.println(brand + "B1车架");
    }

    @Override
    protected void createCarTire() {
        System.out.println(brand + "B1轮胎");
    }
}
