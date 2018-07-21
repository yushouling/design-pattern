package com.ysl.factory;

import com.ysl.product.color.ColorProductFactory;
import com.ysl.product.shape.Circle;
import com.ysl.product.shape.ShapeProductFactory;
import com.ysl.product.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public ShapeProductFactory getShape(String shape) {
        if(shape == null)
            return null;
        if("circle".equals(shape))
            return new Circle();
         else if("square".equals(shape))
            return new Square();

        return null;
    }

    @Override
    public ColorProductFactory getColor(String color) {
        return null;
    }
}
