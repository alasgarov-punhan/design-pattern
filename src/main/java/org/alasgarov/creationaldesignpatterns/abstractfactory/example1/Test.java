package org.alasgarov.creationaldesignpatterns.abstractfactory.example1;

import org.alasgarov.creationaldesignpatterns.abstractfactory.example1.animalfamily.Animal;
import org.alasgarov.creationaldesignpatterns.abstractfactory.example1.colorfamily.Color;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy =(Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");

        String result = "A " + toy.getAnimal() + " with " + color.getColor() + " color " + toy.makeSound();

        System.out.println(result);
    }
}
