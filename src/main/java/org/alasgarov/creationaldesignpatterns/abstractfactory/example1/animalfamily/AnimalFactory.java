package org.alasgarov.creationaldesignpatterns.abstractfactory.example1.animalfamily;

import org.alasgarov.creationaldesignpatterns.abstractfactory.example1.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
    }

}
