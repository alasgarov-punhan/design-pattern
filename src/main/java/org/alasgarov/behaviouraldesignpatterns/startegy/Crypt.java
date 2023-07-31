package org.alasgarov.behaviouraldesignpatterns.startegy;

public interface Crypt {
    void encrypt(String text);

    void decrypt(String text);
}
