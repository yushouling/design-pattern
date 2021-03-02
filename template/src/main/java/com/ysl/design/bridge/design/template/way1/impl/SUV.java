package com.ysl.design.bridge.design.template.way1.impl;

import com.ysl.design.bridge.design.template.way1.AbstractFactory;

public class SUV extends AbstractFactory {
    String brand = "生产SUV型号的";

    @Override
    protected void createCarEngineer() {
        System.out.println(brand + "S1发动机");
    }

    @Override
    protected void createCarFrame() {
        System.out.println(brand + "S1车架");
    }

    @Override
    protected void createCarTire() {
        System.out.println(brand + "S1轮胎");
    }
}
