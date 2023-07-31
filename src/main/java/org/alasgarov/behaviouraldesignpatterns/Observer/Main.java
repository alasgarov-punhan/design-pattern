package org.alasgarov.behaviouraldesignpatterns.Observer;

public class Main {
    public static void main(String[] args) {
        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();

        Publisher publisher = new Publisher();

        publisher.subscribe(subscriberOne);
        publisher.subscribe(subscriberTwo);


        publisher.notifyInformation("hi");


    }
}
