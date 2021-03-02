package com.ysl.design.bridge.design.template.way2;

public interface VehicleCallback<T> {
    T createEngineer();

    T createFrame();

    T createTire();

    T createElectronic();
}
