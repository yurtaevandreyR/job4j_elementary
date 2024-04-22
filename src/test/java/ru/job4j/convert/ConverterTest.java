package ru.job4j.convert;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert900RblThen9Euros() {
        float input = 900;
        float expected = 9;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert900RblThen10Dollars() {
        float input = 900;
        float expected = 10;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001F;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}