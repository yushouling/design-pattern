package com.ysl;

import com.ysl.factory.ColorFactory;
import com.ysl.factory.AbstractFactory;
import com.ysl.factory.ShapeFactory;
import com.ysl.product.color.ColorProductFactory;
import com.ysl.product.shape.ShapeProductFactory;

/**
 * 抽象工厂
 */
public class App {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        ShapeProductFactory circleProduct = shapeFactory.getShape("circle");
        circleProduct.draw();

        AbstractFactory colorFactory = new ColorFactory();
        ColorProductFactory blueProduct = colorFactory.getColor("blue");
        blueProduct.fill();

    }
}
