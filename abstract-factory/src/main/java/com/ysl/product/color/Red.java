package com.ysl.product.color;

public class Red implements ColorProductFactory {
    @Override
    public void fill() {
        System.out.println("fill red");
    }
}
