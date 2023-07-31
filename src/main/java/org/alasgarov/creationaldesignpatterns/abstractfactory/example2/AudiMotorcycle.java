package org.alasgarov.creationaldesignpatterns.abstractfactory.example2;

public class AudiMotorcycle implements IMotorCycle{
    private final String type;
    private final double price;

    public AudiMotorcycle(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
