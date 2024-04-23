package ru.job4j.convert;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static boolean rubleToEuroTest(float input, float expected) {
        return expected == rubleToEuro(input);
    }

    public static boolean rubleToDollarTest(float input, float expected) {
        return expected == rubleToDollar(input);
    }

    public static void main(String[] args) {
        boolean outputEuro = rubleToEuroTest(900F, 9F);
        boolean outputDollar = rubleToDollarTest(900F, 10F);
        System.out.println("900 rubles are 9 euros. Test result: " + outputEuro);
        System.out.println("900 rubles are 10 dollars. Test result: " + outputDollar);

    }

}


