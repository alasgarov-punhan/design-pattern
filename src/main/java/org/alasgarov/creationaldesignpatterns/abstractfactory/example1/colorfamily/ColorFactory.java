package org.alasgarov.creationaldesignpatterns.abstractfactory.example1.colorfamily;

import org.alasgarov.creationaldesignpatterns.abstractfactory.example1.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String colorType) {
        if ("Black".equalsIgnoreCase(colorType)) {
            return new Black();
        } else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }

        return null;
    }
}