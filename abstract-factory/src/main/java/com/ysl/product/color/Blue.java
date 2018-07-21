package com.ysl.product.color;

public class Blue implements ColorProductFactory {
    @Override
    public void fill() {
        System.out.println("fill blue");
    }
}
