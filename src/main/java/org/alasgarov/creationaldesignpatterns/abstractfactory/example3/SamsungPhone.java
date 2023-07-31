package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class SamsungPhone implements Phone{
    @Override
    public String getModel() {
        return "s23 ultra";
    }

    @Override
    public double getPrice() {
        return 1099;
    }
}
