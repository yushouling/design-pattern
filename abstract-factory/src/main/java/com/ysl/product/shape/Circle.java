package com.ysl.product.shape;

public class Circle implements ShapeProductFactory {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
