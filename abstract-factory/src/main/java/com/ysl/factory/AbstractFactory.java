package com.ysl.factory;

import com.ysl.product.color.ColorProductFactory;
import com.ysl.product.shape.ShapeProductFactory;

public abstract class AbstractFactory {
    public abstract ShapeProductFactory getShape(String shape);
    public abstract ColorProductFactory getColor(String color);
}
