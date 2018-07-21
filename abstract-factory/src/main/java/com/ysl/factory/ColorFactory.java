package com.ysl.factory;

import com.ysl.product.color.Blue;
import com.ysl.product.color.ColorProductFactory;
import com.ysl.product.color.Red;
import com.ysl.product.shape.ShapeProductFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public ShapeProductFactory getShape(String shape) {
        return null;
    }

    @Override
    public ColorProductFactory getColor(String color) {
        if(color == null)
            return null;
        if("red".equals(color))
            return new Red();
        else if("blue".equals(color))
            return new Blue();
        return null;
    }
}
