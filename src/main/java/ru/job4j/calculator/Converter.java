package ru.job4j.calculator;

public class Converter {
    public static float convertRubleToEuro(float value, float euroExchangeRate) {
        return value / euroExchangeRate;
    }

    public static float convertRubleToDollar(float value, float dollarExchangeRate) {
        return value / dollarExchangeRate;
    }

    public static void main(String[] args) {
        float amount = 1000F;
        float euroExchangeRate = 99F;
        float dollarExchangeRate = 93F;
        float euro = convertRubleToEuro(amount, euroExchangeRate);
        float dollar = convertRubleToDollar(amount, dollarExchangeRate);
        System.out.println(amount + " rubles are " + euro + " euros.");
        System.out.println(amount + " rubles are " + dollar + " dollars.");
    }
}
