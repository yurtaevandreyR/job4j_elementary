package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        int rem2 = number % 2;
        int rem3 = number % 3;

        if (rem2 == 0 && rem3 == 0) {
            result = "The number divides by 6.";
        } else if (rem2 != 0 && rem3 == 0) {
            result = "The number divides by 3, but it isn't the even number.";
        } else if (rem2 == 0 && rem3 != 0) {
            result = "The number doesn't divide by 3, but it is the even number.";
        } else {
                result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }
}
