package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.loop.Factorial.calculate;

class FactorialTest {

    @Test
    void whenCalculateFactorial5Then120() {
        int number = 5;
        int result = calculate(number);
        int expected = 120;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void whenCalculateFactorial0Then1() {
        int number = 0;
        int result = calculate(number);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorial10Then3628800() {
        int number = 10;
        int result = calculate(number);
        int expected = 3628800;
        assertThat(result).isEqualTo(expected);
    }
}