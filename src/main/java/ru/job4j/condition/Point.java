package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double axisX = Math.pow((x1 - x2), 2);
        double axisY = Math.pow((y1 - y2), 2);
        double result = Math.sqrt((axisX + axisY));
        return result;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);

        double result2 = Point.distance(0, 0, 3, 4);
        System.out.println("result (0, 0) to (3, 4) " + result2);
    }
}
