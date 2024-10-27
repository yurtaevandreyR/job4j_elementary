package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.loop.Counter.sum;

class CounterTest {

    @Test
    void whenSum1To3Then6() {
        int start = 1;
        int finish = 3;
        int result = sum(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum1To4Then10() {
        int start = 1;
        int finish = 4;
        int result = sum(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum3To4Then7() {
        int start = 3;
        int finish = 4;
        int result = sum(start, finish);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSum5To3Then6() {
        int start = 5;
        int finish = 3;
        int result = sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}