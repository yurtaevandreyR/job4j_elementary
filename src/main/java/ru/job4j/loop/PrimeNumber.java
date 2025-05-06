package ru.job4j.loop;

import static ru.job4j.loop.CheckPrimeNumber.check;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int num = 2; num <= finish; num++) {
            if (check(num)) {
                count++;
            }
        }
        return count;
    }
}
