package org.alasgarov.behaviouraldesignpatterns.Observer;

public class SubscriberTwo implements Observer{
    @Override
    public void show(String message) {
        System.out.println("SubscriberTwo : " + message);
    }
}
