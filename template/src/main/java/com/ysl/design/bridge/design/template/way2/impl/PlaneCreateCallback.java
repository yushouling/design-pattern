package com.ysl.design.bridge.design.template.way2.impl;

import com.ysl.design.bridge.design.template.way2.VehicleCallback;

public class PlaneCreateCallback implements VehicleCallback {
    @Override
    public Object createEngineer() {
        System.out.println("生产飞机发动机");
        return null;
    }

    @Override
    public Object createFrame() {
        System.out.println("生产飞机机架");
        return null;
    }

    @Override
    public Object createTire() {
        System.out.println("生产飞机轮胎");
        return null;
    }

    @Override
    public Object createElectronic() {
        System.out.println("生产飞机电子设备");
        return null;
    }
}
