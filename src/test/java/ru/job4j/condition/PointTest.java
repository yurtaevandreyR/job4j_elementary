package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00To34Then5() {
        int x1 = 0;
        int x2 = 3;
        int y1 = 0;
        int y2 = 4;
        double expected = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus12To34Then4Dot47() {
        int x1 = -1;
        int x2 = 3;
        int y1 = 2;
        int y2 = 4;
        double expected = 4.47;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}