package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = 1.15 * (height - 100);
        return result;
    }

    public static double womanWeight(short height) {
        double result = 1.15 * (height - 110);
        return result;
    }

    public static void main(String[] args) {
        short manHeight = 189;
        short womanHeight = 171;

        double man = manWeight(manHeight);
        double woman = womanWeight(womanHeight);

        System.out.println("Man " + manHeight + " is " + man);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }
}
