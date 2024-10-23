package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Triangle.exist;

class TriangleTest {
    @Test
    void whenExist() {
        double a = 2.0;
        double b = 2.0;
        double c = 2.0;
        boolean result = exist(a, b, c);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotExist() {
        double a = 5.5;
        double b = 2.1;
        double c = 100;
        boolean result = exist(a, b, c);
        assertThat(result).isFalse();
    }
}