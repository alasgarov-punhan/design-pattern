package org.alasgarov.creationaldesignpatterns.abstractfactory.example2;

public interface IAbstractFactory {
    ICar createCar(String color, double price);
    IMotorCycle createMotorCycle(String type, double price);
}
