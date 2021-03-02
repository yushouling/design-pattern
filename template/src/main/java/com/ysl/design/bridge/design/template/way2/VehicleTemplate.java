package com.ysl.design.bridge.design.template.way2;

/**
 * 交通工具生产模板
 */
public class VehicleTemplate {

    /**
     * 生产汽车
     */
    public final void createCar(VehicleCallback action) {
        System.out.println("\n-- 开始生产汽车");
        action.createEngineer();
        action.createFrame();
        action.createTire();
        System.out.println("-- 完成生产汽车");
    }

    /**
     * 生产飞机
     */
    public final void createPlane(VehicleCallback action) {
        System.out.println("\n-- 开始生产飞机");
        action.createEngineer();
        action.createFrame();
        action.createTire();
        action.createElectronic();
        System.out.println("-- 完成生产飞机");
    }

    /**
     * 生产核动力航母
     *
     * @param action
     */
    public final void createCVN(CVNCallback action) {
        System.out.println("\n生产核动力航母");
        // 无需实现的方法，使用方无需修改
        if(action != null) {
            Object CVN = action.create();
        }
        System.out.println("暂时不具备实力，延后生产...");
    }


}
