package org.alasgarov.structuraldesignpattern.adapter;


public class CodeXAdapter implements Crypt {
    private CodeX codeX;

    public CodeXAdapter(CodeX codeX) {
        this.codeX = codeX;
    }

    public void encrypt(String text) {
        codeX.textToCode(text);
    }

    public void decrypt(String text) {
        codeX.codeToText(text);
    }

    public void hi(String text) {
        codeX.codeToText(text);
    }


}