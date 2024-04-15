package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] arg) {
        plus(1, 2);
        Calculator.plus(1, 2);

        minus(7, 3);
        Calculator.minus(7, 3);
    }
}
