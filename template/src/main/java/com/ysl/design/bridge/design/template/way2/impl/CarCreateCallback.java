package com.ysl.design.bridge.design.template.way2.impl;

import com.ysl.design.bridge.design.template.way2.VehicleCallback;

public class CarCreateCallback implements VehicleCallback {
    @Override
    public Object createEngineer() {
        System.out.println("生产汽车发动机");
        return null;
    }

    @Override
    public Object createFrame() {
        System.out.println("生产汽车车架");
        return null;
    }

    @Override
    public Object createTire() {
        System.out.println("生产汽车轮胎");
        return null;
    }

    @Override
    public Object createElectronic() {
        return null;
    }
}
