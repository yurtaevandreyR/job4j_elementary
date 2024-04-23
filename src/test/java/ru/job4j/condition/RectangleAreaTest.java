package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2ThenSquare2() {
        double perimeter = 6;
        double ratio = 2;
        double expected = 2;
        double output = RectangleArea.calculateArea(perimeter, ratio);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K1ThenSquare1() {
        double perimeter = 4;
        double ratio = 1;
        double expected = 1;
        double output = RectangleArea.calculateArea(perimeter, ratio);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP3Dot5K3ThenSquare0Dot574() {
        double perimeter = 3.5;
        double ratio = 3;
        double expected = 0.574;
        double output = RectangleArea.calculateArea(perimeter, ratio);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}