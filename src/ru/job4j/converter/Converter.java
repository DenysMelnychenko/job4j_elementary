package ru.job4j.converter;

public class Converter {
    public static final int EUR = 70;
    public static final int USD = 60;

    public static int rubleToEuro(int value) {
        return value / EUR;
    }

    public static int rubleToDollar(int value) {
        return value / USD;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
    }
}