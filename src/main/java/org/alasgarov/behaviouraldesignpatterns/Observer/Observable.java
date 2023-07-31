package org.alasgarov.behaviouraldesignpatterns.Observer;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyInformation(String message);
}
