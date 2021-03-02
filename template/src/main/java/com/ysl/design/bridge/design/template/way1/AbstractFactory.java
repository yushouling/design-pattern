package com.ysl.design.bridge.design.template.way1;

public abstract class AbstractFactory {

    protected abstract void createCarEngineer();

    protected abstract void createCarFrame();

    protected abstract void createCarTire();

    /**
     * 生产汽车模板
     */
    public final void createCar() {
        System.out.println("开始生产汽车");
        createCarEngineer();
        createCarFrame();
        createCarTire();
        System.out.println("完成生产汽车");
    }

}
