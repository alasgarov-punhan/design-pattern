package org.alasgarov.creationaldesignpatterns.staticFactoryMethod;

public class Car {
    private String brand;
    private String model;
    private int year;

    public static Car makeMercedes(String model, int year){
        return new Car("Mercedes", model, year);
    }

    public static Car makeBmw(String model, int year){
        return new Car("BMW", model, year);
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
