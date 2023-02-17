package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    public void whenMan180Then92() {
        short height = 180;
        double expected = 92;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWoman160Then57dot5() {
        short height = 160;
        double expected = 57.5;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

}