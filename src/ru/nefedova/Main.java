package ru.nefedova;

public class Main {

    public static void main(String[] args) {

        int customerAccount = 100;
        int transaction = 1105;
        int result = customerAccount + transaction;

        if (transaction >= 1000) {
            result += transaction / 100;
        }

        System.out.println(result);
    }
}