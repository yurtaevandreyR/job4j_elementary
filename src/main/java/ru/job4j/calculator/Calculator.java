package ru.job4j.calculator;

public class Calculator {

    public static int plus(int first, int second) {
        return first + second;
    }

    public static int minus(int first, int second) {
        return first - second;
    }

    public static void main(String[] arg) {
        System.out.println(plus(1, 2));
        System.out.println(minus(5, 2));
    }
}
