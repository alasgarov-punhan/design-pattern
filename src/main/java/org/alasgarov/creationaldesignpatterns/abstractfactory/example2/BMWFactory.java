package org.alasgarov.creationaldesignpatterns.abstractfactory.example2;

public class BMWFactory implements IAbstractFactory{
    @Override
    public ICar createCar(String color, double price) {
        return new BMWCar(color, price);
    }

    @Override
    public IMotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}
