package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 4));
        System.out.println(sum(3, 4));
        System.out.println(sum(5, 3));
    }
}
