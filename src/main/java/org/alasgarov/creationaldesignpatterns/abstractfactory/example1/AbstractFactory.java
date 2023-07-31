package org.alasgarov.creationaldesignpatterns.abstractfactory.example1;

public interface AbstractFactory<T> {
    T create(String type) ;
}