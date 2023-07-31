package org.alasgarov.structuraldesignpattern.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("test_image.jpg");
        image.display();
    }
}
