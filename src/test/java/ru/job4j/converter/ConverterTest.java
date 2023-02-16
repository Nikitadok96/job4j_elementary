package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        float esp = 0.0001f;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float esp = 0.0001f;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float esp = 0.0001f;
        Assert.assertEquals(expected, out, esp);
    }

}