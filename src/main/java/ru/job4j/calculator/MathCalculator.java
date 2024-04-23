package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDiffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double sumGeneral(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(100, 20));
        System.out.println("Результат расчета равен: " + sumDiffAndDiv(100, 20));
        System.out.println("Результат расчета равен: " + sumGeneral(100, 20));
    }
}
