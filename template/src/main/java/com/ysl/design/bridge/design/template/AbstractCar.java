package com.ysl.design.bridge.design.template;

public abstract class AbstractCar {

    protected abstract void createCarEngineer();

    protected abstract void createCarFrame();

    protected abstract void createCarTire();

    /**
     * 模板方法
     */
    public final void createCar() {
        createCarEngineer();
        createCarFrame();
        createCarTire();
    }
}
