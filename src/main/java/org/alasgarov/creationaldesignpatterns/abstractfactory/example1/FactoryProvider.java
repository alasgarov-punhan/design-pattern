package org.alasgarov.creationaldesignpatterns.abstractfactory.example1;

import org.alasgarov.creationaldesignpatterns.abstractfactory.example1.animalfamily.AnimalFactory;
import org.alasgarov.creationaldesignpatterns.abstractfactory.example1.colorfamily.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Toy".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}