package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class SamsungFactory implements IAbstractFactory{
    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
