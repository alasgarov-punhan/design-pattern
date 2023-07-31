package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class SamsungLaptop implements Laptop{
    @Override
    public String getModel() {
        return "galaxy book";
    }

    @Override
    public double getPrice() {
        return 1800;
    }
}
