package ru.job4j.condition;

public class RectangleArea {
    public static double calculateArea(double perimeter, double ratio) {
        double h = perimeter / ((ratio + 1) * 2);
        double l = h * ratio;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.calculateArea(6, 2);
        double result2 = RectangleArea.calculateArea(4, 1);
        double result3 = RectangleArea.calculateArea(3.5, 3);
        System.out.println("p = 6, k = 2, square = " + result1);
        System.out.println("p = 4, k = 1, square = " + result2);
        System.out.println("p = 3.5, k = 3, square = " + result3);
    }
}
