package com.ysl.design.bridge.design.template.impl;

import com.ysl.design.bridge.design.template.AbstractCar;

public class SUV extends AbstractCar {
    String brand = "生产SUV型号的";

    protected void createCarEngineer() {
        System.out.println(brand + "S1发动机");
    }

    protected void createCarFrame() {
        System.out.println(brand + "S1车架");
    }

    protected void createCarTire() {
        System.out.println(brand + "S1轮胎");
    }
}
