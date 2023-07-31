package org.alasgarov.creationaldesignpatterns.abstractfactory.example1.animalfamily;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
