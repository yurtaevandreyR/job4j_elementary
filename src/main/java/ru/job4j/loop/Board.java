package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("**********");
    }

    public static void main(String[] args) {
        paint(3, 3);
        paint(4, 4);
        paint(5, 5);
        paint(30, 30);
    }
}
