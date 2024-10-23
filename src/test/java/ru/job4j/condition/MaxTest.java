package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Max.max;

class MaxTest {

    @Test
    void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To1Then10() {
        int left = 10;
        int right = 1;
        int result = max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}