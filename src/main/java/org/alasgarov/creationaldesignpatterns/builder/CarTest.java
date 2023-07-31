package org.alasgarov.creationaldesignpatterns.builder;

public class CarTest {
    public static void main(String[] args) {

        Car bmw = new Car.Builder("BMW", "e46", 2004).build();
        System.out.println(bmw);
        System.out.println("-------------------");
        Car mercedes = new Car.Builder("Mercedes", "w201", 1993)
                .setColor("black")
                .setType("sedan")
                .build();
        System.out.println(mercedes);
    }
}
