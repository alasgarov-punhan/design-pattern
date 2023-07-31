package org.alasgarov.behaviouraldesignpatterns.Observer;

public class SubscriberOne implements Observer{
    @Override
    public void show(String message) {
        System.out.println("SubscriberOne : " + message);
    }
}
