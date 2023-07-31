package org.alasgarov.structuraldesignpattern.adapter;

public class Main {

    public static void main(String[] args) {

        Crypt crypt = new CryptA();
        crypt.encrypt("Yusuf");
        crypt.decrypt("Metin");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.encrypt("Dilek");
        crypt.decrypt("Mehmet");

        System.out.println("-------------");

        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("Ahmet");
        crypt.decrypt("Acar");

        CodeXAdapter codeXAdapter = new CodeXAdapter(codeX);
        codeXAdapter.encrypt("Punhan");
        codeXAdapter.decrypt("Alasgarov");
    }
}