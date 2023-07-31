package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class ApplePhone implements Phone{
    @Override
    public String getModel() {
        return "Iphone 14";
    }

    @Override
    public double getPrice() {
        return 999;
    }
}
