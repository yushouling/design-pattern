package com.ysl.design.bridge.design.template.impl;

import com.ysl.design.bridge.design.template.AbstractCar;

public class Bus extends AbstractCar {
    String brand = "生产公交车型号的";

    protected void createCarEngineer() {
        System.out.println(brand + "B1发动机");
    }

    protected void createCarFrame() {
        System.out.println(brand + "B1车架");
    }

    protected void createCarTire() {
        System.out.println(brand + "B1轮胎");
    }
}
