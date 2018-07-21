package com.ysl.product.shape;

public class Square implements ShapeProductFactory {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
