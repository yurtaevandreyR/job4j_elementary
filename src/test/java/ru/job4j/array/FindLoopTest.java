package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.array.FindLoop.indexInRange;

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
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 8;
        int start = 1;
        int finish = 3;
        int result = indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenStartEqualFinishThenMinus1() {
        int[] data = {1, 3, 5, 7, 9, 0, 0};
        int element = 0;
        int start = 2;
        int finish = start;
        int result = indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}