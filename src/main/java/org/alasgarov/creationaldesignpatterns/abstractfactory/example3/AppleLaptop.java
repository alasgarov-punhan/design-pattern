package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class AppleLaptop implements Laptop{
    @Override
    public String getModel() {
        return "Macbook pro";
    }

    @Override
    public double getPrice() {
        return 1999;
    }
}
