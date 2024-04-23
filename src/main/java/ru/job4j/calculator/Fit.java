package ru.job4j.calculator;

public class Fit {

    public static double manWeight(int height) {
        return 1.15 * (height - 100);
    }

    public static double womanWeight(int height) {
        return 1.15 * (height - 110);
    }

    public static void main(String[] args) {
        int manHeight = 189;
        int womanHeight = 171;
        double man = manWeight(manHeight);
        double woman = womanWeight(womanHeight);
        System.out.println("Man " + manHeight + " is " + man);
        System.out.println("Woman " + womanHeight + " is " + woman);
    }
}
