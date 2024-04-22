package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan189Then102dot35() {
        short input = 189;
        double expected = 102.35;
        double output = Fit.manWeight(input);
        double value = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenWoman171Then70dot14() {
        short input = 171;
        double expected = 70.14;
        double output = Fit.womanWeight(input);
        double value = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}