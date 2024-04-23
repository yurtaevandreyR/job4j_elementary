package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / ((k + 1) * 2);
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(6, 2);
        double result2 = RectangleArea.square(4, 1);
        double result3 = RectangleArea.square(3.5, 3);
        System.out.println("p = 6, k = 2, square = " + result1);
        System.out.println("p = 4, k = 1, square = " + result2);
        System.out.println("p = 3.5, k = 3, square = " + result3);
    }
}
