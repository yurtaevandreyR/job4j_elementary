package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.array.Min.findMin;

class MinTest {

    @Test
    public void when3MinThen3() {
        int[] arr = {4, 44, 3, 7};
        int result = findMin(arr);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinSomeEqualNumbersThenThisNumber() {
        int[] arr = {5, 10, 5, 5, 12, 65, 5};
        int result = findMin(arr);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}