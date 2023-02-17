package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class SqAreaTest {
    @Test
    public void whenP12K2Then6dot75() {
        double p = 12;
        double k = 3;
        double expected = 6.75;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP8K3Then3() {
        double p = 8;
        double k = 3;
        double expected = 3;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}