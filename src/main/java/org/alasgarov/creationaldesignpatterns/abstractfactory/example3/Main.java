package org.alasgarov.creationaldesignpatterns.abstractfactory.example3;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory appleFactory = new AppleFactory();
        IAbstractFactory samsungFactory = new SamsungFactory();

        Laptop appleLaptop = appleFactory.createLaptop();
        Phone applePhone = appleFactory.createPhone();

        System.out.println("model - " + appleLaptop.getModel() + "; price - " + appleLaptop.getPrice());
        System.out.println("model - " + applePhone.getModel() + "; price - " + applePhone.getPrice());

        System.out.println("-------------------------");
        Laptop samsungLaptop = samsungFactory.createLaptop();
        Phone samsungPhone = samsungFactory.createPhone();

        System.out.println("model - " + samsungLaptop.getModel() + "; price - " + samsungLaptop.getPrice());
        System.out.println("model - " + samsungPhone.getModel() + "; price - " + samsungPhone.getPrice());
    }
}
