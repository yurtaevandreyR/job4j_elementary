package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenElement4Then3() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6, 7};
        int element = 4;
        int result = FindLoop.indexOf(data, element);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenElement2ThenNo5() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        int num = 2;
        int result = FindLoop.indexOf(arr, num);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}