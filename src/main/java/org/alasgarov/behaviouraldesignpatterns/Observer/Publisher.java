package org.alasgarov.behaviouraldesignpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable{
    List<Observer> observersList = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyInformation(String message) {
        for (Observer o : observersList){
            o.show(message);
        }
    }
}
