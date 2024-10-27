package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.loop.Counter.*;

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
    void whenSum5To3Then0() {
        int start = 5;
        int finish = 3;
        int result = sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenMinus3To3Then0() {
        int start = -3;
        int finish = 3;
        int result = sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenMinus10ToMinus1ThenMinus30() {
        int start = -10;
        int finish = -1;
        int result = sumByEven(start, finish);
        int expected = -30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven10To20Then90() {
        int start = 10;
        int finish = 20;
        int result = sumByEven(start, finish);
        int expected = 90;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEven7To3Then0() {
        int start = 7;
        int finish = 3;
        int result = sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}