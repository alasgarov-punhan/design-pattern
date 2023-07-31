package org.alasgarov.creationaldesignpatterns.abstractfactory.example1.animalfamily;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Barks";
    }
}
