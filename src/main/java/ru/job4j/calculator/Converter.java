package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 99;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 93;
        return result;
    }

    public static void main(String[] args) {
        float amount = 1000;
        float euro = rubleToEuro(amount);
        float dollar = rubleToDollar(amount);

        System.out.println(amount + " rubles are " + euro + " euros.");
        System.out.println(amount + " rubles are " + dollar + " dollars.");
    }
}
