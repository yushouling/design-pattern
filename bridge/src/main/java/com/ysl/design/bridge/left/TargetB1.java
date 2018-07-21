package com.ysl.design.bridge.left;

import com.ysl.design.bridge.BridgeTarget;

public class TargetB1 implements BridgeTarget {
    @Override
    public void target() {
        System.out.println("target: B1");
    }
}
