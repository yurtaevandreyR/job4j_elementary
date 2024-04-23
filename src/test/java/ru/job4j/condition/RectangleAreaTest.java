package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2ThenSquare2() {
        byte p = 6;
        byte k = 2;
        double expected = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K1ThenSquare1() {
        byte p = 4;
        byte k = 1;
        double expected = 1;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP3Dot5K3ThenSquare0Dot574() {
        double p = 3.5;
        byte k = 3;
        double expected = 0.574;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}