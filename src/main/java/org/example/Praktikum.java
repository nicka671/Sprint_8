package org.example;

public class Praktikum {
    public static void main(String[] args) {
        String cardCredentials = "Тимоти Шаламе";
        Account accountCredentials = new Account(cardCredentials);
        accountCredentials.checkNameToEmboss();
    }
}