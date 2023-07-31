package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class AppleFactory implements IAbstractFactory {

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
